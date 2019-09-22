import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Letter Grade Converter");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
			System.out.print("Enter Numerical Grade: ");
			int numGrade = sc.nextInt();
			
			String letGrade;
			if (numGrade >= 88 && numGrade <=100) {
				letGrade = "A";
			} else if (numGrade >= 80 && numGrade <=87){
				letGrade = "B";
			} else if (numGrade >= 67 && numGrade <= 79) {
				letGrade = "C";
			} else {
				letGrade = "F";	
			}
			
			String message = "Letter Grade: " + letGrade + "\n";
			System.out.println(message);
			
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			
		}
		System.out.println("Thanks for stopping by!");
		sc.close();
	}

}
