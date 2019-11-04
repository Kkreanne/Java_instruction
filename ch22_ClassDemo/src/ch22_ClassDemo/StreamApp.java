package ch22_ClassDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApp {

	public static void main(String[] args) {
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "513-555-1234"));
		contacts.add(new Contact("Ann Meyer", null, null));
		contacts.add(new Contact("Jim Murach", "jm@murach.com", null));
		
		contacts.stream()
		.filter(c -> c.getPhone() == null) //filters items that do not have a phone num
		.forEach(c -> System.out.println(c.getName()));
	
//connects to a collection and lets you do things 
	
	List<Contact> contactsNoPhone = contacts.stream()
			.filter(c -> c.getPhone() == null)
			.collect(Collectors.toList());
	System.out.println("There are " + contactsNoPhone.size()
						+ " contacts with no phone number.\n");
	
	List<String> contactNames = contacts.stream()
			.map(c -> c.getName())
			.collect(Collectors.toList());
	
	contactNames.stream().forEach(str -> System.out.println(str));
	
	List<String> contactNames2 = contacts.stream()
			.map(Contact::getName) // establish a stream and map each contact name to it
			.collect(Collectors.toList());

	contactNames2.stream().forEach(System.out::println);

	String csv = contacts.stream()
			.map(c -> c.getName())
					.reduce("", (a, b) -> a + b + ", ");
	csv = csv.substring(0, csv.length() -2);
	System.out.println("All contacts: " + csv);
	}
}
