package datastructure.list;

import oopmodeling.Planet;

public class LinkedListTest {

	public static void main(String[] args) {
	Node <Planet>	 first=new Node<Planet >(new Planet(10000,"Earth" ,12311));
	Node <Planet>	 second=new Node<Planet >(new Planet(1000,"Mars" ,1230));
	Node <Planet>	 third=new Node<Planet >(new Planet(100,"Moon" ,123));
	Node <Planet>	 fourth=new Node<Planet >(new Planet(100,"Jupiter" ,123));
	
	first.setNext(second);
	second.setNext(third);
	third.setNext(fourth);
	
	LinkedListImpl<Integer> list = new LinkedListImpl<Integer>();
	list.add(12);
	list.add(33);
	list.add(44);
	list.add(320);
	
	}
}
