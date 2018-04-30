package edu.handong.csee.java.lab13.prob3;	// makes it a package 

import java.util.*;	// import to use Scanner class

public class ShapeTester {	// a class to call main method

	public static void main(String[] args) {	// a main method to see if it's working well
		Scanner keyboard = new Scanner(System.in);	// instantiate Scanner to user nextDouble()
		
		System.out.print("Enter raidus: ");	// ask user for the radius
		double r = keyboard.nextDouble();	// receives value at r
		Shape s1 = new Circle(r);			// instantiate a new circle with radius r
		System.out.println("Radius: " + ((Circle) s1).getRadius());	// print out the radius of the s1
		
		s1.printAreaAndPeri();	// prints the area and perimeter of the s1
		
		System.out.print("\nEnter length and width: ");	// ask user for length and width of a rectangle
		double l, w;	// variables to store width and length
		l = keyboard.nextDouble();	// l stores length
		w = keyboard.nextDouble();	// w stores width
		Rectangle s2 = new Rectangle(l, w);	// instantiate a new rectangle with length l and width w
		System.out.println("Length: " + ((Rectangle) s2).getLength());	// print out the length of the s2
		System.out.println("Width: " + ((Rectangle) s2).getWidth());	// print out the width of the s2
		
		s2.printAreaAndPeri();	// prints the area and perimeter of the s2
		keyboard.close();	// close keyboard for safety
	}

}
