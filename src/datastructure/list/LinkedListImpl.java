package datastructure.list;

/**
 * List implementation by linking node objects
* @author Andrés
* 10 mar 2026
 */
public class LinkedListImpl <E> implements List<E>{

	
	private Node<E> first;
	private Node<E> Last;
	
	
	@Override
	public void add(E data) {
		// 1 create a new node 
		Node<E> newNode = new Node<E>(data);
		// 2 add the new node to the list
		//System.out.println(first);
		//System.out.println(Last);
		//System.out.println(newNode);
		if(first==null) {
			first = Last = newNode;
		}
		else {
			//set the next of the last to the node
			Last.setNext(newNode);
			Last = newNode;
		}
	}

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printList() {
		// TODO Auto-generated method stub
		
	}

	
}
