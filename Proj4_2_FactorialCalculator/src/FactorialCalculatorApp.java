import java.util.Scanner;

public class FactorialCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Factorial Calculator!");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter an integer that is greater than 0 AND less than 10: ");
			int n = sc.nextInt();
			
			//long o = (n*!);
			for (int i=1; i<n; i++) {
				System.out.println("The factorial of " + n + "is " + (n!) + ".");
			}
			
			
			
			System.out.println("Continue??");
			choice = sc.next();
		}
		
		System.out.println("Thanks for stopping by!");
		sc.close();
	}
	
}
