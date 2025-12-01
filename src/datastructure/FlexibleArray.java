package datastructure;



/**
 * This is a class that represents an extensible array.
 * An array has a fixed capacity, when reaching the end
 * of the array, we have to expand it automatically
 * @param <T>
 */
public class FlexibleArray<T> {
    private T[] elements;
    private static final int INITIAL_CAPACITY= 5;
    private int size= 0;
     
    
    private static int EXPANSION_FACTOR = 40;
    public FlexibleArray(int size) {
    	if (size<=0) {
    		size = INITIAL_CAPACITY;
		}
        elements = (T[]) new Object[size];
    }
public FlexibleArray() {
      elements = (T[]) new Object[INITIAL_CAPACITY];
}
    public void add(T element) {
    
         //paso 0:check if we have reached to the last position,
        //if true,we have to expand the capacity of the array

        //paso1 : add the element to the last position of the array
    	if (size==elements.length) {
    		 T[] newArr = (T[]) new Object[elements.length + EXPANSION_FACTOR];
    		// newArr[0] = elements[0];
    	//	 newArr[1]= elements[1];
    		 //copy the elements from the old array to the new one
    		 for (int i = 0; i < elements.length; i++) {
				newArr[i] = elements[i];
			}
    		 elements = newArr;
		}
    	elements[size]=element;
    	size++;
    }

    public void remove(int i) {
    	//step 1: eliminate the element at position passed by the parameter 
    	elements[i]= null;
    	//elements[i]=elements[i+1];
    	//elements[i+1]=elements[i+2];
    	size--;
    }
    

    public int size() {
        return size;
    }
    public T[] getAll() {
    	return elements;
    }
}
