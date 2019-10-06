package numberChecker;
import java.util.Scanner;

public class MyConsole extends Console {

	static Scanner sc = new Scanner(System.in);

	public String getString(String prompt) {
		String s = "";
		System.out.print(prompt);
		if (sc.hasNext()) {
			s = sc.next();
		}
		sc.nextLine();
		return s;
	} 
	
	public boolean testEven(int int1) {
		boolean isEven = false;

		if (int1%2==0) {
			isEven = true;
			return isEven;
		}
		return isEven;
	}
	
	public static boolean askToContinue() {
		boolean isValid = false;

		while (!isValid) {
			System.out.print("Continue? (y/n): ");
			String choice = sc.nextLine();

			if (choice.isEmpty()) {
				System.out.println("This entry is required. Please try again.");
			} else if (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n")) {
				System.out.println("Please enter \"y\" to continue or \"n\" to quit.");
			} else if (choice.equalsIgnoreCase("y")) {
				isValid = true;
				sc.nextLine();
			} else {
				break;
			}
		}
		return isValid;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
