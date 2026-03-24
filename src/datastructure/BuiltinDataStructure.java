package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

import oopmodeling.Planet;

public class BuiltinDataStructure {
public static void main(String[] args) {
	Planet planet1 = new Planet();
	Planet planet2 = new Planet(123,"Mars");
	Planet[] pls = new Planet[5];
	pls[0]= planet1;
	pls[1]= planet2;
	//create an object of class{@link ArrayList}
	ArrayList<Planet> planets= new ArrayList<>();
	//add an object to position
	planets.add(planet1);
	planets.add(planet2);
	planets.get(1);
	LinkedList<String>names = new LinkedList<>();
	names.add("Pablo");
	//less efficient than accessing elements in an Array when using in LinkedList
	names.add("Justo");
	names.get(1);
	Stack<Integer> callstack= new Stack<>();
	//add an element on the top of the stack object
	callstack.push(34);
	callstack.push(10);
	callstack.push(2);
	//used to read the element on the top of the stack without eliminating 
	System.out.println(callstack.peek());
	
}
}
