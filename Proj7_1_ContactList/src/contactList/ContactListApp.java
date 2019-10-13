package contactList;

import java.util.Scanner;
import contactList.Contact;

public class ContactListApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Contact List Application! \n");
		Scanner sc = new Scanner(System.in);
		
		Contact contact1 = new Contact();
		
		System.out.print("Enter first name: ");
		String fName = sc.nextLine();
		System.out.print("Enter last name: ");
		String lName = sc.nextLine();
		System.out.print("Enter email: ");
		String email = sc.nextLine();
		System.out.print("Enter phone number: ");
		String phoneNum = sc.nextLine();
		
		System.out.println(contact1.getfName());
		System.out.println(contact1.getlName());
		System.out.println(contact1.getEmail());
		System.out.println(contact1.getPhoneNum());
		
		System.out.println(contact1.toString());
		
		sc.close();
	}

}
