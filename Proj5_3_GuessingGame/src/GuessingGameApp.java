import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Guess the Number Game!!");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++\n");
		
		System.out.println("I'm thinking of a number from 1 to 100.");
		System.out.println("Try to guess it.\n");
		
		Scanner sc = new Scanner(System.in);
		String choice = "";
		
		do {
			int randomNum = (int)(Math.random() * 100) + 1;
			boolean isCorrect = false;
			
			int attempts = 0;
			while (!isCorrect) {
				int guess = getIntWithinRange(sc, "Guess a number: ", 1, 100);
				if (guess < (randomNum - 10)) {
					System.out.println("Way too low!");
					attempts ++;
					continue;
				}
				if (guess < randomNum) {
					System.out.println("Too low!");
					attempts ++;
					continue;
				}
				if (guess > randomNum + 10) {
					System.out.println("Way too high!");
					attempts ++;
					continue;
				}
				if (guess > randomNum) {
					System.out.println("Too high!");
					attempts ++;
					continue;
				}
				attempts++;
				isCorrect = true;
			}
			
			System.out.println("Congrats! You got it right, and it only took you " + attempts + "tries!");
			if (attempts > 7) {
				System.out.println("What took you so long??");
			} else if (attempts > 3) {
				System.out.println("Not bad!");
			} else {
				System.out.println("Your a math wizard!");
			}
			
			System.out.println("Continue? y/n");
			choice = sc.nextLine();
			
		} while (choice.equalsIgnoreCase("y"));
		
		System.out.println("Bye, come back soon!");
		sc.close();
	}

	private static int getIntWithinRange(Scanner sc, String prompt, int min, int max) {
		boolean isValid = false;
		int input = 0;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				input = sc.nextInt();
			} else {
				System.out.println("I said give me an int");
				sc.hasNextLine();
				continue;
			}
			
			if (input < min) {
				System.out.println("Needs to be at least " + min + ".");
				sc.nextLine();
				continue;
			} else if (input > max) {
				System.out.println("Needs to be " + max + " or less.");
				sc.nextLine();
				continue;
			} else {
				sc.nextLine();
				isValid = true;
			}
		}
		return input;
	}
}
