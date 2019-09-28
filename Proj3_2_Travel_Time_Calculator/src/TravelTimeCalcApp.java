import java.util.Scanner;
import java.math.BigDecimal;
import java.text.NumberFormat;

public class TravelTimeCalcApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Time Travel Calculator!");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {		
			
			System.out.print("Enter miles: ");
			double miles = sc.nextDouble();
			System.out.print("Enter miles per hour: ");	
			double mph = sc.nextDouble();
			System.out.println();			
			
			System.out.println("Estimated Travel Time");
			System.out.println("======================");
			
			NumberFormat numFormat = NumberFormat.getNumberInstance();
			
				double trvl = miles/mph;
				numFormat.setMaximumFractionDigits(2);
				String trvlTime = numFormat.format(trvl);
				
			System.out.println("Hours: " + trvlTime);
		
			System.out.print("Continue? (y/n): ");
            choice = sc.next();
		}
		
		System.out.println("Bye");
		sc.close();
	}

}
