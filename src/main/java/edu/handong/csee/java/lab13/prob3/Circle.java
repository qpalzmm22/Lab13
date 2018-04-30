package edu.handong.csee.java.lab13.prob3;	// makes it a package
	
public class Circle extends Shape{	// this class has a superclass of Shape
	private double radius;	// a variable to store radius value

	public Circle(double radius) {	// a constructor that takes a double parameter
		this.radius = radius;	//sets the input as the this.radius
	}
	public double getRadius() {	// gets the radius of this class
		return radius;	// returns the radius of this class 
	}
	public void setRadius(double radius) {	// sets the this.radius by new value 
		this.radius = radius;	// the input parameter becomes the new this.radius
	}
	public double calcArea() {	// calculates the area of the circle
		return Math.PI * radius * radius;	//A(circle) = pi * r^2;
	}
	public double calcPerimeter() {	// calculates the perimeter of the circle
		return 2 * Math.PI * radius;	// P(circle) = 2 * pi * r
	}
	
	
}
