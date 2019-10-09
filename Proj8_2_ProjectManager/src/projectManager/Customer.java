package projectManager;

public class Customer extends Person {
	
	int customerNumber;

	public Customer(String first, String last, int customerNumber) {
		super(first, last);
		this.customerNumber = customerNumber;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	@Override
	public String toString() {
		String message = "Name: " + firstName + " " + lastName + "\n"
						+ "Customer Number: " + customerNumber;
		return message;
	}
	
}
