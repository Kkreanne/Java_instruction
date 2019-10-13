package contactList;

public class Contact {
	
	private String fName;
	private String lName;
	private String email;
	private String phoneNum;
	
	public Contact (){
		fName = "";
		lName = "";
		email = "";
		phoneNum = "";
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public String toString() {
		String message = "------------------------------\n"
						+ "---Current Contact------------\n"
						+ "------------------------------\n"
						+ "Name: " + fName + lName + "\n"
						+ "Email Address: " + email + "\n"
						+ "Phone Number: " + phoneNum + "\n"
						+ "------------------------------\n";
		return message;
	}

}
