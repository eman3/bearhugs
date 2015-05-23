package me.eman.main;

public class Main {
	
	public static void main(String[] args) {
		
		// end EVERYTHING in AN ENDCOLON
		String myString = "Put me in double quotes";
		
		// a number doesn't have double quotes
		int myInt = 12;
		
		// a double is a decimal number
		double myDouble = 12.8;
		
		// to print stuff out you use
		System.out.println("I AM GOING IN THE CONSOLE");
	}
	
	// THIS IS A METHOD
	// write public void NAME OF METHOD then () and then {
	public static void myMethod() {
		System.out.println("I HAVE BEEN CALLED");
	}
	
	//THIS IS A RETURN AND RECIVE METHOD
	// it goes like public VAR YOU WANT TO RETURN MYNAME() then {
	public static int addition(int one, int two) {
		
		int total = one + two;
		
		return total;
	}
	
}
