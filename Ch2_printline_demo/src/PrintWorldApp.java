import java.util.Scanner;

public class PrintWorldApp {

	public static void main(String[] args) {
		System.out.println("Hello, Welcome to the Console Demo App!");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {


			System.out.println("Enter a whole number: ");
			int number1 = sc.nextInt();
			System.out.println("Enter another whole number: ");
			int number2 = sc.nextInt();

			System.out.print("Enter a sentence: ");
			String word1 = sc.next();
			String word2 = sc.next();
			String word3 = sc.next();
			String restOfSentence = sc.nextLine();

			System.out.println(word1);
			System.out.println(word2);
			System.out.println(word3);
			System.out.println(restOfSentence);

			System.out.print("Enter a double: ");
			double decimal = sc.nextDouble();

			if (decimal > 50.0) {
				System.out.println(decimal + " is greater than 50.0");
			} else if (decimal < 50.0) {
				System.out.println(decimal + " is less than 50.0");
			} else {
				System.out.println(decimal + " is 50.0!");
			}

			int sum = number1 + number2;

			System.out.println("Your total is: " + sum);

			System.out.print("Continue? (y/n): ");
			choice = sc.nextLine();

		}

		System.out.println("Thanks for stopping by!");

		sc.close();
	}

}
