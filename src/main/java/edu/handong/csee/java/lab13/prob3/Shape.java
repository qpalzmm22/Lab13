package edu.handong.csee.java.lab13.prob3;

public abstract class Shape {
	public abstract double calcArea();
	public abstract double calcPerimeter();
	public void printAreaAndPeri() {
		System.out.println("Area: " + calcArea());
		System.out.println("Perimeter: " + calcPerimeter());
	}
}
