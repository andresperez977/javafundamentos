package datastructure;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class SortingTest {
	public static void main(String[] args) {
		String[] names = { "Pablo", "Juan", "Ana", "Justo", "Ruben" };
		int[] scores = { 12, 34, 3423, 34, 2, 20, 3, 2 };
		sort(scores);
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
