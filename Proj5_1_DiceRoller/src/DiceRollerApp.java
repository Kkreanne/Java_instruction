import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Dice Roller\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Roll the dice?");
		String choice = sc.nextLine();
		
		while (choice.equalsIgnoreCase("y")) {
			int dieOne = rollDie();
			int dieTwo = rollDie();
			int total = dieOne + dieTwo;
			
			System.out.println("First die: " + dieOne);
			System.out.println("Second die: " + dieTwo);
			System.out.println("Total " + total);
			if (total == 12 ) {
				System.out.println("Boxcars!");
			}
			if (total == 2) {
				System.out.println("Snake Eyes!");
			}
			
			System.out.print("Roll Again? y/n");
			choice = sc.nextLine();
			System.out.println();
		
		} 
		System.out.println("Thanks for rolling by!");
		sc.close();
	}
	
	private static int rollDie() {
		int die = (int)(Math.random() * 6) + 1;
		return die;
	}
	
}
