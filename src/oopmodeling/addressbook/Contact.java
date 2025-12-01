package oopmodeling.addressbook;

public class Contact {
	public Contact(String name, String phone, String email) {
		// TODO Auto-generated constructor stu
		this.name =name;
		this.phoneNumber=phone;
		this.email=email;
	}
public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//Attributes or fields of the class 
private String phoneNumber;
private String name;
private String surname;
private String email;



}

