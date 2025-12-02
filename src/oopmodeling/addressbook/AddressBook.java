package oopmodeling.addressbook;
/**This class is i charge of administration of 
 * a group of contact
* @author Andrés
* 26 nov 2025
 */

import java.util.Scanner;
/** This class is used to manage a list of contact objects
 * 
 */
import datastructure.FlexibleArray;

public class AddressBook {
// Attributes
	public AddressBook() {
		contacts = new FlexibleArray<Contact>();
	}
	
	// This is container for the list of contact objects
	 protected FlexibleArray<Contact> contacts;
	protected Scanner scanner;
	 //behaves
	 public void showContact() {
		 
		 
	 }
	public void addContact(Contact contact) {
		contacts.add(contact);
	}	
	public boolean removeContact(String name) {
		 //Contact[] eles= contacts.getAll();
		 for (int i = 0; i < contacts.size(); i++) {
			if(contacts.get(i).getName().equals(name)) {}
			
		}
		contacts.remove(0);
		return false;
	}	
	
}
