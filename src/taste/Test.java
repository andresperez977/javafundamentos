package taste;

import oopmodeling.Planet;
import oopmodeling.Star;

public class Test {
	public static void main(String[] args) {
		System.out.println(12);
		int num1=274839;
		int num2=385490;
		System.out.println(num1+num2);
		Star sun =new Star();
		Planet marte= new Planet();
		Planet tierra= new Planet();
		sun.equals(tierra);
		//sun.mass = 15; 
		System.out.println(sun.getMass());
		sun.setMass(num2);
		marte.setSize(65);
		System.out.println("mass of the sun is " + sun.getMass());
	}

}
