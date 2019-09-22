import java.util.Scanner;

public class RectangleCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Perimeter Calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			System.out.print("Enter Length: ");
			int length = sc.nextInt();
			
			System.out.print("Enter Width: ");
			int width = sc.nextInt();
			
			int area = width*length;
			int perimeter = (2 * width) + (2 * length);
			
			System.out.println("Area: " + area);
			System.out.println("Permiter: " + perimeter);
			System.out.println();
			
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			
		}
		sc.close();
	}

}
