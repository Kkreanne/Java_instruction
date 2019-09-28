import java.util.Scanner;

public class FactorialCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Factorial Calculator!");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		int count;
		int fact = 1;
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter an integer that is greater than 0 AND less than 10: ");
			count = sc.nextInt();
			sc.nextLine();
			
			for (int i=1; i<=count; i++) {
				fact *=i;
			}
			
			System.out.println("The factorial of " + count + " is " + fact + ".");			
			
			System.out.println("Continue??");
			choice = sc.next();
		}
		
		System.out.println("Thanks for stopping by!");
		sc.close();
	}
	
}
