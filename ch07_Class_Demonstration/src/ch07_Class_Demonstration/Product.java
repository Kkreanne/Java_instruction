package ch07_Class_Demonstration;

public class Product {
	private String code;
	private String description;
	private double price;
	
	public Product() {
		code = "";
		description = "";
		price = 0.0;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		String message = "Code: " + code + "\n"
						+ "Description: " + description + "\n"
						+ "Price: " + price;
		return message;
	}
	
}