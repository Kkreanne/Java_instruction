package animalCounter;

public class AnimalCounterApp {

	public static void main(String[] args) {
		System.out.println("Counting Alligators...\n");
		Alligator a = new Alligator();
		count(a, 3);
		System.out.println("Counting Sheep...\n");
		Sheep d = new Sheep("Dolly");
		count(d, 2);
		try {
			Sheep m = (Sheep) d.clone();
			m.setName("Molly");
			count(m, 3);
		} catch (CloneNotSupportedException e) {
			System.out.println("A cloning error occured.");
		}
		count(d, 1);
	}

	public static void count(Countable c, int maxCount) {
		c.resetCount();
		for (int i = 1; i <= maxCount; i++) {
			c.incrementCount();
			System.out.println(c.getCountString());
		}
		System.out.println("");
	}
	
}
