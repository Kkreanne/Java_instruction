package ch07_Class_Demonstration;

import java.util.Scanner;

public class ClassDemoApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Demo App! \n");
		Scanner sc = new Scanner(System.in);
		
		Product product1 = new Product();
		
		System.out.print("Enter product code: ");
		String code = sc.nextLine();
		System.out.print("Enter product description: ");
		String description = sc.nextLine();
		System.out.print("Enter product price: ");
		double price = sc.nextDouble();
		
		product1.setCode(code);
		product1.setDescription(description);
		product1.setPrice(price);
		
		System.out.println(product1.getCode());
		System.out.println(product1.getDescription());
		System.out.println(product1.getPrice());
		
		System.out.println(product1.toString());
		
		sc.close();
	}

}
