package edu.handong.csee.java.lab13.prob3;

import java.math.*;

public class Circle extends Shape{
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double calcArea() {
		return Math.PI * radius * radius;
	}
	public double calcPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	
}
