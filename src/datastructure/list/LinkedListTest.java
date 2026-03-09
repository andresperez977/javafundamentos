package datastructure.list;

import oopmodeling.Planet;

public class LinkedListTest {

	public static void main(String[] args) {
	Node <Planet>	 first=new Node<Planet >(new Planet(10000,"Earth" ,12311));
	Node <Planet>	 second=new Node<Planet >(new Planet(1000,"Mars" ,1230));
	Node <Planet>	 third=new Node<Planet >(new Planet(100,"Moon" ,123));
	
	
	first.setNext(second);
	second.setNext(third);
	
	}
}
