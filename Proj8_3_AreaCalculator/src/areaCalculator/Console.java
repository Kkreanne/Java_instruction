package areaCalculator;
import java.util.Scanner;

public class Console {
		
		private static Scanner sc = new Scanner(System.in);
		
		public static String getString(String prompt) {
			System.out.print(prompt);
			String s = sc.next();
			sc.nextLine();
			return s;
		}

		public static int getInt(String prompt) {
			int i = 0;
			boolean isValid = false;
			while (!isValid) {
				System.out.print(prompt);
				if (sc.hasNextInt()) {
					i = sc.nextInt();
					isValid = true;
				} else {
					System.out.println("Error! Invalid integer. Try again.");
				}
				sc.nextLine();
			}
			return i;
		}
		
		public static int getIntWithinRange(String prompt, int min, int max) {
			int i = 0;
			boolean isValid = false;
			while (!isValid) {
				i = getInt(prompt);
				if (i <= min) {
					System.out.println("Error! Number must be greater than " + min + ".");
				} else if (i >= max) {
					System.out.println("Error! Number be less than " + max + ".");
				} else {
					isValid = true;
				}
			}
			return i;
		}
		
		public static double getDouble(String prompt) {
			double d = 0;
			boolean isValid = false;
			while (!isValid) {
				System.out.print(prompt);
				if (sc.hasNextDouble()) {
					d = sc.nextDouble();
					isValid = true;
				} else {
					System.out.println("Error! Invalid number. Try again.");
				}
				sc.nextLine();
			}
			return d;
		}
		
		public double getDoubleWithinRanges(String prompt, double min, double max) {
			double d = 0;
			boolean isValid = false;
			while (!isValid) {
				d = getDouble(prompt);
				if (d <= min) {
					System.out.println("Error! Number must be greater than " + min + ".");
				} else if (d >= max) {
					System.out.println("Error! Number must be less then " + max + ".");
				} else {
					isValid = true;
				}
			}
			return d;
		}
		
		public static boolean askToContinue() {

			boolean isValid = false;

			while (!isValid) {

				System.out.print("Continue? (y/n): ");
				String choice = sc.next();

				if (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n")) {
					System.out.println("Please enter \"y\" to continue or \"n\" to quit.");
				} else if (choice.equalsIgnoreCase("y")) {
					isValid = true;
					sc.nextLine();
					System.out.println();
				} else {
					break;
				}
			}
			return isValid;
		}
	
	}