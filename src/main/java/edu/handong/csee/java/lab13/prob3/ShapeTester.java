package edu.handong.csee.java.lab13.prob3;

import java.util.*;

public class ShapeTester {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter raidus: ");
		double r = keyboard.nextDouble();
		Shape s1 = new Circle(r);
		System.out.println("Radius: " + ((Circle) s1).getRadius());
		
		s1.printAreaAndPeri();
		
		System.out.print("\nEnter length and width: ");
		double l, w;
		l = keyboard.nextDouble();
		w = keyboard.nextDouble();
		Rectangle s2 = new Rectangle(l, w);
		System.out.println("Length: " + ((Rectangle) s2).getLength());
		System.out.println("Width: " + ((Rectangle) s2).getWidth());
		
		s2.printAreaAndPeri();
	}

}
