import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class TemperatureConverterApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Temperature Converter!");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
			System.out.print("Enter degrees in Fahrenheit: ");
			double degreeF = sc.nextDouble();
			
			double convert = (degreeF - 32) * 5/9;
			
			System.out.print("Degrees in Celsius: " + convert);
			System.out.println();
			
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			
		}
		
		sc.close();
	}
	
}
