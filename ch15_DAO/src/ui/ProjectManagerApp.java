package ui;

import java.util.List;

import db.DAO;
import db.ProductTextFile;
import logic.Product;
import util.Console;

public class ProjectManagerApp {
	
	private static DAO<Product> productFile = new ProductTextFile();

	public static void main(String[] args) {
		System.out.println("Welcome to the Product Manager App!\n");
		displayMenu();
		
		String action = "";
		while (!action.equalsIgnoreCase("exit")){
			action = Console.getString("Enter a command: ");
			System.out.println();
			
			if (action.equalsIgnoreCase("list")) {
				displayAllProducts();
			} else if (action.equalsIgnoreCase("add")) {
				addProduct();
			} else if (action.equalsIgnoreCase("del") || action.equalsIgnoreCase("delete")) {
				deleteProduct();
			} else if (action.equalsIgnoreCase("help") || action.equalsIgnoreCase("menu")) {
				displayMenu();
			} else if (action.equalsIgnoreCase("exit")) {
				System.out.println("Bye.\n");
			} else {
				System.out.println("Error! Not a valid command.\n");
			}
		}
	}
	
	public static void displayMenu() {
		System.out.println("COMMAND MENU");
		System.out.println("list      - List all products");
		System.out.println("add       - Add a product");
		System.out.println("del       - Delete a product");
		System.out.println("help      - Show this menu");
		System.out.println("exit      - Exit this application\n");
		
	}
	
	public static void displayAllProducts() {
		System.out.println("PRODUCT LIST");
		
		List<Product> products = productFile.getAll();
		StringBuilder sb = new StringBuilder();
		for (Product p : products) {
			sb.append(p.getCode() + "\t"); //pad method 
			sb.append(p.getDescription() + "\t");
			sb.append(p.getPrice() + "\n");   //format
		}
		System.out.println(sb);
	}
	
	public static void addProduct() {
		String code = Console.getString("Enter product code: ");
		String description = Console.getLine("Enter product description: ");
		double price = Console.getDouble("Enter price: ");
		
		Product p = new Product(code, description, price);
		boolean wasSuccessful = productFile.add(p);
		
		if (wasSuccessful) {
			System.out.println("Successfully added " + description);
		} else {
			System.out.println("Error adding " + description);
		}
	}

	public static void deleteProduct() {
		String code = Console.getString("Enter product code to delete: ");
		Product p = productFile.get(code);
		
		if (p != null) {
			productFile.delete(p);
			System.out.println(p.getDescription() + " has been deleted.\n");
		} else {
			System.out.println("No product matches code " + code);
		}
	}
}