package oopmodeling.addressbook;

import java.util.Scanner;

/**
 * The class used to interact with users.
* @author Andrés
* 26 nov 2025
 */
public class ContactApp {
 final static AddressBook addressBook= new AddressBook();
 final static Scanner scanner = new Scanner(System.in);

 
public static void main(String[] args) {
	byte option = 4;
	while (true) {
		showMenu();
		
		option = scanner.nextByte();
		System.out.println(option );
		
		if (option == 4) {
			break;
		}
		else if (option == 1) {
			addContact();
		}
		else if (option == 2) {
			showContacts();
		}
		else {
			removeContact();
		}
	}
	
	
}


private static void showContacts() {
	// TODO Auto-generated method stub
	addressBook.showContact();
}


private static void addContact() {
	// TODO Auto-generated method stub
	System.out.println("---add contact to your address book-----");
	// 1 The user introduce the number, name and other information about the contact
	System.out.println("Please enter the name ");
	
	scanner.nextLine();
	
	String name = scanner.nextLine();
	System.out.println(name);
	System.out.println("Please enter the phone number ");
	String phone = scanner.nextLine();
	System.out.println(phone);
	System.out.println("Please enter the email ");
	String email= scanner.nextLine();
	System.out.println(email);
	//2 Create an object of "Contact" encapsulating all the data passed in the first step 
	Contact newContact = new Contact(name, phone, email);
	//3 Add the new object to the contact array
	addressBook.addContact(newContact);
	System.out.println("Contacto added");
}
private static void removeContact() {
	System.out.println("---remove contact from your adress book----");
    System.out.print("Introduce de name ");
    String name = scanner.nextLine();
    addressBook.removeContact(name);
}


private static void showMenu() {
	// TODO Auto-generated method stub
	System.out.println("1, Add contact");
	System.out.println("2, Show contacts");
	System.out.println("3, Remove contact");
	System.out.println("4, Exit ");
}
}
