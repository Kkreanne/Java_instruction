package projectManager;

public class PersonManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Person Manager App!\n");
		
		boolean ask = true;
		String cust;
		String cust2;
		String emp;
		String emp2;
		String firstName = "";
		String lastName = "";
		int custNumber = 0;
		String ssn = "";
		
		while (ask == true) {
			String choice = Console.getString("Create customer or employee? (c,e): ");
			switch (choice) {
			case "c":
			case "C":
				cust = Console.getString("First name: "); 
				cust2 = Console.getString("Last name: ");
				custNumber = Console.getInt("Customer number: \n");
				Customer c = new Customer(firstName, lastName, custNumber);
				System.out.println("You entered a new customer: \n" + "Name: " + cust + " " + cust2 + "\n" + "Customer Number: " + c.customerNumber + "\n");
				ask = Console.askToContinue();
				continue;
			case "e":
			case "E":
				emp = Console.getString("First name: ");
				emp2 = Console.getString("Last name: ");
				ssn = Console.getString("SSN: \n");
				Employee e = new Employee(firstName, lastName, ssn);
				System.out.println("You entered a new employee: \n" + "Name: " + emp + " " + emp2 + "\n" + "SSN: " + e.getSsn() + "\n");
				ask = Console.askToContinue();
				continue;
			}
  
		} 
		
		System.out.println("Goodbye!");
	}

}