package projectManager;

public class Employee extends Person {

	String ssn;
	
	public Employee(String first, String last, String ssn) {
		super(first, last);
		this.ssn = ssn;
	}

	public String getSsn() {
		
		String input = ssn;		//input string
		String lastFourDigits = "";		//substring containing last 4 characters

		if (input.length() > 4) 
		{
		    lastFourDigits = input.substring(input.length() - 4);
		} 
		else 
		{
		    lastFourDigits = input;
		}
		return lastFourDigits;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		String message = "Name: " + firstName + " " + lastName 
						+ "SSN: " + "xxx-xx-" + getSsn();
		return message;
	}
	
}
