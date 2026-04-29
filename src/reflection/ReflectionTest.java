package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Iterator;



import oopmodeling.addressbook.AddressBook;
import oopmodeling.addressbook.Contact;

import java.lang.annotation.Annotation;

public class ReflectionTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class<AddressBook> cls1 = AddressBook.class;
		Class<AddressBook> cls2 = (Class<AddressBook>) new AddressBook().getClass();
		Class<?> cls3 = Class.forName("oopmodeling.addressbook.AddressBook");
		inspectClass(cls1);
		
		AddressBook addressBook = new AddressBook();
		manipulateObject(addressBook);
	}
 
	private static void manipulateObject(AddressBook addressBook) {
		Class<?> cls = addressBook.getClass();
		Field[] fields =cls.getDeclaredFields();
		try {
			Field field =cls.getDeclaredField( "contacts  " );
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private static void inspectClass(Class<AddressBook> cls1) {
		cls1.getDeclaredConstructors();
		Method[] ms = cls1.getDeclaredMethods();
		for (int i = 0; i < ms.length; i++) {
			System.out.println("method name is " + ms[i].getName());

			Parameter[] params = ms[i].getParameters();
			for (int j = 0; j < params.length; j++) {
				System.out.println("   param name: " + params[j].getName() + " | type: " + params[j].getType());
			}
		}

		Method[] ms2 = cls1.getDeclaredMethods();
		for (int i = 0; i < ms.length; i++) {
			System.out.println("method name is " + ms[i].getName());
			System.out.println("method type is " + ms[i].getParameters());
		}
		cls1.getDeclaredMethods();
		for (int i = 0; i < ms.length; i++) {
			System.out.println("method name is " + ms[i].getName());
			System.out.println("method type is " + ms[i].getReturnType());
		}
		cls1.getDeclaredFields();
		for (Field field : cls1.getDeclaredFields()) {
			System.out.println("field name is " + field.getName());
			System.out.println("field type is " + field.getType());

		}
		cls1.getAnnotations();
		Annotation[] an = cls1.getAnnotations();
		for (int i = 0; i < an.length; i++) {
			System.out.println("annotation is " + an[i]);
		}

	}
}
