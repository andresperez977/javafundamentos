package datastructure;

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
		
		float[] salaries= { 234.324f, 23423.23f, 324.3f, 32423.34f };
		//{235.324f, 23424.23f ,325.3f , 32424.34f};
		salaries[0] = salaries[0] +10;
		System.out.println(salaries[0]);
		salaries[1] = salaries[1] +10;
		System.out.println(salaries[1]);
		salaries[2] = salaries[2] +10;
		System.out.println(salaries[2]);
		salaries[3] = salaries[3] +10;
		System.out.println(salaries[3]);
		 for (int i = 0; i < salaries.length; i++) {
			 salaries[i] = salaries[i] +10;
			 System.out.println(salaries[i]);
			
			
		}
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
