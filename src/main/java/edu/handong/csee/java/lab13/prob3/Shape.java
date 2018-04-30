package edu.handong.csee.java.lab13.prob3;	// makes it a package

public abstract class Shape {	// abstract class that is ancestor of Circle and Rectangle classes
	public abstract double calcArea();	// abstract method that calculates the area of the shape
	public abstract double calcPerimeter();	// abstract method that calculates the perimeter of the shape
	public void printAreaAndPeri() {	// prints the area and the perimeter of the shape
		System.out.println("Area: " + calcArea());	// tells user what the area is
		System.out.println("Perimeter: " + calcPerimeter());	// tells user what the perimeter is
	}
}
