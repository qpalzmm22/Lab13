package edu.handong.csee.java.lab13.prob6; // makes it a package


public class Printer {	// prints the strings according its class

	public static void print(Object other) {	// prints strings according to their clss
		String str = other.toString();	// str stores the String form  
		if(other instanceof UpPoint)	// if the object is the instance of UpPoint
			str = str.toUpperCase();	// make it upper class
		System.out.println(str);		// prints the result of it
	}
	
	public static void main(String[] args) {	// main method to test if it's working
		UpPoint str1 = new UpPoint(3, 3);	// UpPoint str1 has x value of 3 y value of 3
		DownPoint str2 = new DownPoint(2, 5);	// DownPoint str2 has x value of 2 y value of 5
		DownPoint str3 = new DownPoint(4, 7);	// DownPoint str3 has x value of 4 y value of 7
		UpPoint str4 = new UpPoint(9, 12);	// UpPoint str4 has x value of 9 y value of 12
		
		print(str1);	// prints the str1 according to its class 
		print(str2);	// prints the str2 according to its class
		print(str3);	// prints the str3 according to its class
		print(str4);	// prints the str4 according to its class
	}

}
