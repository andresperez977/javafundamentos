package basics;

public class OperatorsTest {
	
	public static void main(String[] args) {
		aritmeticOperationTest();
		unaryOperatorsTest();
	
	
	}

	private static void unaryOperatorsTest() {
		// TODO Auto-generated method stub
		int num1 = -234;
		num1++;
		System.out.println(num1);
		++num1;
		System.out.println(num1);
		System.out.println(num1++);
	}

	private static void aritmeticOperationTest() {
		// declaring three integer variables
		 int num1 =5, num2, num3 =50;
		 System.out.println(num1);
		 num1=3;
		 System.out.println(num1);
		 num2=3;
		 int result;
		 /**
		  * 1 Se lee los valores de los operantes del lado derecho
		  * 2 Se realizan la operacion con los operantes
		  * 3 Se asigna el resultado de la operacion a la variable al lado izq
		  */
		result= num1 + num2;
		System.out.println("the result is" + result);
		result= result - num3;
		System.out.println("the result is" + result);
		//multiplication
		result= result *2;
		System.out.println("the result is" + result);
		//division
		result=result / 2;
		System.out.println("the result is" + result);
		result = result %2;
		System.out.println("the modulus result is" + result);
	}

}
