package ch08_inheritanceDemo;

public class DemoApp {

	public static void main(String[] args) {

		System.out.println("Welcome!");
		
		Animal dolphin1 = new Dolphin("Bob", 3, 25, "bottlenose", "tight");
		
		System.out.println(dolphin1.getName());
		System.out.println(dolphin1.getLimbs());
		System.out.println(dolphin1.getAge());
		System.out.println(dolphin1.getType());
		System.out.println(((Dolphin) dolphin1).getBHsize());
		dolphin1.eat();
		dolphin1.sleep();
		((Dolphin) dolphin1).swim();
	}
		

}
