package edu.handong.csee.java.lab13.prob6;	// makes it a package

public class UpPoint implements CapitalPrint{	// a class that prints string upper class
	private int x, y; 	// variables to store two values
	public UpPoint(int x, int y) {	// constructor that sets this.x and this.y by corresponding parameters
		this.x = x; // sets this.x to first argument
		this.y = y;	// sets this.y to second argument
	}
	public String toString() {	// returns the string form 
		return "x : " + x + " y : " + y; // shows the x and y value
	}
}
