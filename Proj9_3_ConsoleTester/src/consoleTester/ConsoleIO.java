package consoleTester;

import java.util.Scanner;

public class ConsoleIO implements UserIO {
	
	Scanner sc;
	
	public ConsoleIO() {
		sc = new Scanner(System.in);
	}

	@Override
	public int getInt(String prompt) {

		int i = 0;
		boolean isValid = false;

		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Invalid number. Please try again.");
			}
			sc.nextLine();
		}
		return i;
	}

	@Override
	public int getInt(String prompt, int min, int max) {

		int i = 0;
		boolean isValid = false;
		while (!isValid) {
			i = getInt(prompt);
			if (i < min) {
				System.out.println("Number must be equal to or greater than " + min + ".");
			} else if (i > max) {
				System.out.println("Number must be equal to or less than " + max + ".");
			} else {
				isValid = true;
			}
		}
		return i;
	}

	@Override
	public double getDouble(String prompt) {

		double d = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Invalid number. Please try again.");
			}
			sc.nextLine();
		}
		return d;
	}
	
	@Override
	public double getDouble(String prompt, double min, double max) {

		double d = 0;

		boolean isValid = false;
		while (!isValid) {
			d = getDouble(prompt);
			if (d < min) {
				System.out.println("Number must be equal to or greater than " + min + ".");
			} else if (d > max) {
				System.out.println("Number must be equal to or less than " + max + ".");
			} else {
				isValid = true;
			}
		}
		return d;
	}

	@Override
	public String getString(String prompt) {

		String s = "";
		while ("".equals(s)) {
			System.out.print(prompt);
			s = sc.nextLine();
			if (s.equals("")) {
				System.out.println("This entry is required. Please try again.");
				continue;
			} else {
				break;
			}
		}
		return s;
	}

	@Override
	public String getString(String prompt, String s1, String s2) {

		String s = "";
		boolean isValid = false;

		while (!isValid) {
			s = getString(prompt);
			if (!s.equalsIgnoreCase(s1) && !s.equalsIgnoreCase(s2)) {
				System.out.println("Please enter " + s1 + " or " + s2 + " to continue.");
			} else {
				isValid = true;
			}
		}
		return s;
	}
	
	@Override
	public void print(String s) {
		System.out.print(s);
	}

	@Override
	public void println() {
		System.out.println();
	}

	@Override
	public void println(String s) {
		System.out.println(s);
	}
	
}