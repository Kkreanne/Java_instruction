import java.util.Scanner;

public class ChangeCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Change Calculator!");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter number of cents (0-99): ");
			int change = sc.nextInt();
			System.out.println();
			
		    int quarters = Math.round((int)change/25);
		    change=change%25;
		    int dimes = Math.round((int)change/10);
		    change=change%10;
		    int nickels = Math.round((int)change/5);
		    change=change%5;
		    int pennies = Math.round((int)change/1);
			
		    System.out.println("Quarters: " + quarters);
		    System.out.println("Dimes: " + dimes);
		    System.out.println("Nickels: " + nickels);
		    System.out.println("Pennies: " + pennies);
		    System.out.println();
		    
			System.out.print("Continue? (y/n): ");
            choice = sc.next();
		}
		
		
		System.out.println("Goodbye!");
		sc.close();
	}

}
