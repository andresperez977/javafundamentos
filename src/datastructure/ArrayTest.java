package datastructure;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

import javax.naming.ldap.InitialLdapContext;

import oopmodeling.Planet;

public class ArrayTest {

	public static void main(String[] args) {

		String[] names = { "Pablo", "Juan" };
		Planet[] planets = { new Planet(), new Planet() };

		System.out.println(names[1]);

		// Create an array with a capacity of storing 10000 integers
		int[] nums = new int[10000];
		System.out.println("the length of the number array is " + nums.length);

		initializeArray(nums);
		sumup();

		finalMaxMin(nums);

		incrementSalary();
		int[] scores = { 12, 34, 3423, };

		swithValues(scores, 8, 4);
		reverse(scores     );
		
		int[] sliced = slice(scores, 2,45);  
		System.out.println(Arrays.toString(sliced));
		
		slice(scores, 2, 10);
		slice(scores, 10, 0);
	}
 
	private static int[] slice(int[] arr, int start, int end ) { 
		
		
		if (arr == null) {
			return null;
		}
		if (start < 0 || end < 0 || start >= arr.length || end >= arr.length) {
			return null;
		}
		if (start> end) {
			return null;
		}
		// TODO Auto-generated method stub
		int[] result = new int [end - start +1]; 
		result[0] = arr[start];
		result[1] = arr[start +1 ];
		result[2] = arr[start +2 ];
		for (int i = 0; i < result.length; i++) {
			result[i] = arr[start + i];
		}
		return null;
	}

	private static void reverse(int[] arr) {
		int index1 = 0;
		int index2 = arr.length -1;
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length / 2; i++) {
		
			int  dato= arr[index1];
			
			arr[index1] =arr[index2];
			arr[index2]= dato;
			index1++;
			index2--;
			
		}
		
		System.out.println(Arrays.toString(arr));
	
	}

	public static void swithValues(int[] arr, int index1, int index2) {
		// TODO Auto-generated method stub
		if (arr ==null) {
			return;
		}
		//>= means greater or equal
		// the index of the last element in array is arr.length -1
		 if (index1 >= arr.length || index2 >= arr.length) {
			return;
		}
			
		
		if (index1 < 0 || index2 < 0 ) {
			return;
		}
		int  dato= arr[index1];
		arr[index1] =arr[index2];
		arr[index2]= dato;
		
	}

	private static void incrementSalary() {
		// TODO Auto-generated method stub
		float[] salaries = { 234.324f, 23423.23f, 324.3f, 32423.34f };
		// { 235.324f, 23424.23f, 325.3f, 32424.34f };
		/**
		 * increment the value of the first data by 10 stored in the array
		 */
		salaries[0] = salaries[0] + 10;
		System.out.println(salaries[0]);

		salaries[1] = salaries[1] + 10;
		System.out.println(salaries[1]);

		salaries[2] = salaries[2] + 10;
		System.out.println(salaries[2]);

		salaries[3] = salaries[3] + 10;
		System.out.println(salaries[3]);

		// Automatizacion del proceso con bucles
		for (int i = 0; i < salaries.length; i++) {
			salaries[i] = salaries[i] + 10;
			System.out.println(salaries[i]);
		}

		int i = 0;
		salaries[i] = salaries[i] + 10;
		System.out.println(salaries[i]);
		i++;

		salaries[i] = salaries[i] + 10;
		System.out.println(salaries[i]);
		i++;

		salaries[i] = salaries[i] + 10;
		System.out.println(salaries[i]);
		i++;

		salaries[i] = salaries[i] + 10;
		System.out.println(salaries[i]);
	}

	private static void finalMaxMin(int[] nums) {
		int maximun = nums[0];
		int minimun = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (maximun < nums[i]) {
				maximun = nums[i];

			}
			if (minimun > nums[i]) {
				minimun = nums[i];
			}
		}

	}

	private static void sumup() {
		int[] scores = { 12, 34, 3423, };
		System.out.println(scores[0]);// Acess to the first
		System.out.println(scores[1]);// Retrieve the second
		System.out.println(scores[2]);

		try {
			System.out.println(scores[3500]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int total = scores[0] + scores[1] + scores[2];
		System.out.println("the total score is " + total);
		int totalScore = 0;
		for (int i = 0; i < scores.length; i++) {
			totalScore += scores[i];
			System.out.println("totalScore =" + totalScore);
		}
	}

	private static void initializeArray(int[] nums) {
		// TODO Auto-generated method stub
		Random ramdom = new Random();
		ramdom.nextInt(-10000, 1000000);
		nums[0] = ramdom.nextInt(-100000, 1000000);

		int len = nums.length;
		int j = 0;
		while (len > j) {
			nums[j] = ramdom.nextInt(-100000, 1000000);
			j = j + 1;// This operation is the same as j++
		}
	}
}
