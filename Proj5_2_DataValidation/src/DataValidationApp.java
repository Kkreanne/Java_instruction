import java.util.InputMismatchException;
import java.util.Scanner;

public class DataValidationApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Perimeter Calculator!\n");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			double length = getDoubleWithinRange(sc, "Enter length: ", 0, 1000000);
			double width = getDoubleWithinRange(sc, "Enter width: ", 0, 1000000);;
			try {
				System.out.print(length);
				length = sc.nextDouble();
				System.out.print(width);
				width = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Error! This entry is required. Try again.\n");
				sc.hasNextLine();
			}
			
			// calculate area
			double area = length * width;
			
			// calculate perimeter
			double perimeter = 2 * (length + width);
			
			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			
			System.out.print("Continue? y/n");
			choice = sc.next();
			sc.hasNextLine();
		}
		
		sc.close();
	} 

	public static double getDoubleWithinRange(Scanner sc, String prompt,
		    double min, double max) {
		double d = 0;
		boolean isValid = false;
		while (!isValid) {
			d = getDouble(sc, prompt);
			if (d <= min) {
				System.out.println("Error! Number must be greater than " + min + ".");
			} else if (d >= max) {
				System.out.println("Error! Number must be less than " + max + ".");
			} else {
				isValid = true;
			}
		}
			return d;
		}

	public static double getDouble(Scanner sc, String prompt) {
		double d = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid decimal value. Try again!");
			}
			sc.hasNextLine();
		}
		return d;
	}
	
	public static int getIntWithinRange(Scanner sc, String prompt,
		    int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (!isValid) {
			i = getInt(sc, prompt);
			if (i <= min) {
				System.out.println("Error! Number must be greater than " + min + ".");
			} else if (i >= max) {
				System.out.println("Error! Number must be less than " + max + ".");
			} else {
				isValid = true;
			}
		}
		return i;		
	}
	
	/*public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid number. Try again.");
			}
			sc.hasNextLine();
		}
		return i;
	}*/
	
}