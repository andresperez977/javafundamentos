package datastructure.list;

public interface List<E> {

	public  void add(E  e);
	/**
	 * Remove the last element in the list
	 * @return
	 */
	public E removeLast();
	/**
	 * Remove all the element in the list
	 */
	
	public void clear();
	/**
	 * print all the elements in the list
	 */
	
	public void printList();
}


	
