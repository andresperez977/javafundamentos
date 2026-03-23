package datastructure.list;



/**
 * List implementation by linking node objects
* @author Andrés
* 10 mar 2026
 */
public class LinkedListImpl <E> implements List<E>{

	//used to point to the firts node of the list,
	//so we can go to  the next node from the first using the 
	 //'first.next' property
	
	private Node<E> first;
	/**
	 * this reference to the last node allows us to add new nodes ass well as direct 
	 * access to the last node effectively
	 */
	private Node<E> last;
	
	private int size;
	@Override
	public void add(E data) {
		System.out.println("size =" + size);
		// 1 create a new node 
		Node<E> newNode = new Node<E>(data);
		// 2 add the new node to the list
		//System.out.println(first);
		//System.out.println(Last);
		//System.out.println(newNode);
		size = size + 1;
		if(first==null) {
			first = last = newNode;
		}
		else {
			//set the next of the last to the node
			last.setNext(newNode);
			last = newNode;
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
		first = null;
		last = null;
		size = 0;
		
	}

	@Override
	public void printList() {
		// TODO Auto-generated method stub
		
	}

	public void add(Node<E> node) throws Exception {

	    // 1. Comprobamos que el nodo recibido como parámetro no sea null
	    // Si fuera null, no tendría sentido añadirlo a la lista
	    // por lo que lanzamos una excepción
	    if (node == null) {
	        throw new Exception("No se puede añadir un nodo null a la lista");
	    }

	    // 2. Comprobamos si la lista está vacía
	    // La lista estará vacía cuando la referencia 'first' sea null
	    if (first == null) {

	        // Si la lista está vacía, el nuevo nodo será
	        // tanto el primer nodo como el último de la lista
	        first = node;
	        last = node;

	    } else {

	        // --- CORRECCIÓN DEL ERROR ---
	        // En el código original solo se hacía: last = node;
	        // Esto es incorrecto porque no se enlazaba el nodo anterior
	        // con el nuevo nodo, rompiendo la lista enlazada.

	        // Primero enlazamos el último nodo actual con el nuevo nodo
	        last.next = node;

	        // Después actualizamos la referencia 'last'
	        // para que apunte al nuevo nodo añadido
	        last = node;
	    }
	}
	
}
