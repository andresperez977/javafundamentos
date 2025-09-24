package javacontrols;

public class IfControl {
	public static void main(String[] args) {
		
		int num1 = 12;
		int num2 = 34;
		int result;
		result = num1 - num2;
		System.out.println(result);
		/**
		 * the number stored in "result" can be any intenger,
		 * but the following program includes all the posibilities
		 */
		if (result > 0) {
			System.out.println("number 1 is greater than number 2");
			
		}
		else if (result == 0) {
			
		} 
			
		
		else {
			//
			System.out.println("number 1 is less than number 2");
		}		
	}

}
