package basics;

import oopmodeling.Celestianbody;
import oopmodeling.Planet;
import oopmodeling.Star;

public class ConversionTest {
public static void main(String[] args) {
	
	primitiveConversion();
	
	//Polymorphish
	Planet p1 = new Planet();
	// A planet is not a star, we can not assign a planet object to a star object
	//Star s1 = (Star) new Planet;
	//In this following two cases, a planet is of type CelestianBO
	//Star  = (Star)new Planet();  
	Celestianbody p2 = new Planet();  
	Object p3= new Planet();  
	Object p4 = new Celestianbody();
	
	Planet p5 = (Planet)p3;
	System.out.println(p5);
	System.out.println(p3);
	System.out.println(p5 == p3);
	
	Object[] planets  = new Planet[20];
	Planet[] pls = (Planet[]) planets;
	
	//create an array of Object of size 20
	// 2 assign each posicion of the array with an object of planet 
	// 3 convert the whole array explicity to an array of planet 
	
	polymorphisMethod(p2);
			
}
private static void polymorphisMethod(Celestianbody cb) {
	// TODO Auto-generated method stub
	
}
private static void primitiveConversion() {
	// TODO Auto-generated method stub
	int num1= 234564564;
	byte num2 = 127;
	float num3= 324.4f;
	double num4=34;
	System.out.println(num1);
	num1=129;
	System.out.println(num1);
	num2=(byte)num1;
	System.out.println("number 2 is " + num2);
	// Even explicitly we can not and should not cast an int array to a byte array nor the contrary
	//because the process is complicated to do and not so useful
	int[] nums1= new int[23];
	byte[] nums2= new byte[2];
	//nums1 = (int[])nums2;
	//nums2= (byte[])nums1;
}

}
