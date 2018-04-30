package edu.handong.csee.java.lab13.prob3;	// makes it a package

public class Rectangle extends Shape{	// this class has a superclass of Shape
	private double length;	// a variable to store length value
	private double width;	// a variable to store width value
	
	public Rectangle(double l, double w) {	// a constructor that takes 2 double pameter
		this.length = l;	// sets first input as length
		this.width = w;		// sets second input as width
	}
	public double getLength() {	// gets the length of the rectangle
		return length;	// returns this.length;
	}
	public void setLength(double length) {	// sets the this.length by new value 
		this.length = length;	// the input parameter becomes the new this.length
	}
	public double getWidth() {	// gets the width of the rectangle
		return width;	// returns this.width
	}
	public void setWidth(double width) {	// sets the this.width by new value
		this.width = width;	// the input parameter becomes the new this.width
	}
	public double calcArea() {	// calculates the area of the rectangle
		return width * length;	// A(rect) = w * l
	}
	
	public double calcPerimeter() {	// calculates the perimeter of the rectangle
		return 2 * width + 2 * length;	// P(rect) = 2w + 2l
	}
	
	
}
