package datastructure.list;

import oopmodeling.Planet;

// The class represent 

//<T>GENERIC type parameter which means we can store any type of data in a Node class
public class Node<T> {

	
	protected Node next;
	
	private T data;

	public Node(T data) {
		this.data=data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}
