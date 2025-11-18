package datastructure;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class SortingTest {
	public static void main(String[] args) {
		String[] names = { "Pablo", "Juan", "Ana", "Justo", "Ruben" };
		int[] scores = { 12, 34, 3423, 34, 2, 20, 3, 2 };
		sort(scores);
       boolean isExisting = binarySearch(234, scores);
        System.out.println(isExisting);
       isExisting = linearSearching(234,scores);
	}


    /**
     * In this algorithm, we search a specific element in an ordened array by
     * comparing the element witch the ones in the array one by one.
     * The time consumed in this algorithm is proportional to the size of the array
     * @param element
     * @param elements
     * @return
     */
    private static boolean linearSearching(int element, int[] elements) {
        if (elements == null) {return false;}

        /**
         * Steps
         * 1 Create a loop to traverse the elements in the array
         * 2 In the body of the loop, we compare the element with
         * the elements of the array, if there is a match, we return
         * true
         */
        for(int i = 0; i < elements.length; i++) {
            if (elements[i] == element){
            return true;

            }
        }

        return false;
    }

    private static boolean binarySearch(int element, int[] elements) {

        // 1 calculate the index of the middle element
        int start = 0;
        int middle = elements.length / 2;
        if (elements[middle] == elements[middle]) {
            return true;

        }
       else if (elements[middle] > elements[middle]) {


        }
        return false;
    }

    private static void sort(int[] arr) {

		int j = 0;

//		for (int i = 0; i < arr.length - 1 - j; i++) {
//			int previous = arr[i];
//			int next = arr[i + 1];
//			if (previous > next) {
//				ArrayTest.swithValues(arr, i, i + 1);
//				System.out.println(Arrays.toString(arr));
//			}
//		}
//		
//		j++;
//		for (int i = 0; i < arr.length - 1 - j; i++) {
//			int previous = arr[i];
//			int next = arr[i + 1];
//			if (previous > next) {
//				ArrayTest.swithValues(arr, i, i + 1);
//				System.out.println(Arrays.toString(arr));
//
//			}
//		}
//		j++;
//		
//		for (int i = 0; i < arr.length - 1 - j; i++) {
//			int previous = arr[i];
//			int next = arr[i + 1];
//			if (previous > next) {
//				ArrayTest.swithValues(arr, i, i + 1);
//				System.out.println(Arrays.toString(arr));
//			}
//		}
//		j++;

		while (j < arr.length) {
			for (int i = 0; i < arr.length - 1 - j; i++) {
				int previous = arr[i];
				int next = arr[i + 1];
				if (previous > next) {
					ArrayTest.swithValues(arr, i, i + 1);
					System.out.println(Arrays.toString(arr));
				}
			}
			j++;
		}
	}
}
