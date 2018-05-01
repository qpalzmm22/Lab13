package edu.handong.csee.java.lab13.prob6;	// makes it a package

public class DownPoint {	// a class that prints string lower class
	private int x, y; // variable to store two values
	public DownPoint(int x, int y) {	// constructor that sets this.x and this.y by corresponding parameters
		this.x = x;	// sets this.x to first argument
		this.y = y;	// sets this.y to second argument
	}
	public String toString() {	// returns the string form
		return "x : " + x + " y : " + y; // shows the x and y value
	}
}
