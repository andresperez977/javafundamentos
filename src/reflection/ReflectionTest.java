package reflection;

import oopmodeling.addressbook.AddressBook;

public class ReflectionTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class<AddressBook> cls1 = AddressBook.class;
		Class<AddressBook> cls2 = 
				(Class<AddressBook>) new AddressBook().getClass();
		Class<?> cls3=
		Class.forName("oopmodeling.addressbook.AddressBook");
		
		inspectClass(cls1);
	}

	private static void inspectClass(Class<AddressBook> cls1) {
		cls1.getDeclaredConstructors();
		cls1.getDeclaredMethods();
		cls1.getDeclaredFields();
		cls1.getAnnotations();
		
	}
}
