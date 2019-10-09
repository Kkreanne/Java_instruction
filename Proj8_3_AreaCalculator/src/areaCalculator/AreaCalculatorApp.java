package areaCalculator;

public class AreaCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area Calculator!\n");
		
		boolean ask = true;
		double radius;
		double width;
		double height;
		
		while (ask == true) {
			String choice = Console.getString("Calculate area of Circle, Square, or Rectangle? (c,s,r): ");
			switch (choice) {
			case "c":
			case "C":
				radius = Console.getDouble("Enter radius: ");
				Circle c = new Circle(radius);
				System.out.println("The area of the circle you entered is: \n" + c.getArea());
				ask = Console.askToContinue();
				continue;
			case "s":
			case "S":
				width = Console.getDouble("Enter width: ");
				Square s = new Square(width);
				System.out.println("The area of the square you entered is: \n" + s.getArea());
				ask = Console.askToContinue();
				continue;
			case "r":
			case "R":
				width = Console.getDouble("Enter width: ");
				height = Console.getDouble("Enter height: ");
				Rectangle r = new Rectangle(width, height);
				System.out.println("The area of the rectangle you entered is: \n" + r.getArea());
				ask = Console.askToContinue();
				continue;
			}
		}
		
		System.out.println("Goodbye!");
		
	}

}
