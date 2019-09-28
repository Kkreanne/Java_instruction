import java.util.Scanner;

public class CommonDivisorApp {

	public static void main(String[] args) {
		System.out.println("Greatest Common Divisor Calculator");
		Scanner sc = new Scanner(System.in);
		String choice = "";
		
		do {
			System.out.println("Enter a number:");
			int x = sc.nextInt();
			System.out.println("Enter another number:");
			int y = sc.nextInt();
			
			while (x != y) {
				
				if (x>y) {
					x -= y;
				} else {
					y -= x;
				}
			}
			
			System.out.println("Greatest Common Divisor: " + y);
			
		} while (choice.equalsIgnoreCase("y")); {
			
		}
	} 

}
