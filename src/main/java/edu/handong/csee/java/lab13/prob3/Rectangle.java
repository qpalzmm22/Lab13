package edu.handong.csee.java.lab13.prob3;

public class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle(double l, double w) {
		this.length = l;
		this.width = w;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double calcArea() {
		return width * length;
	}
	
	public double calcPerimeter() {
		return 2 * width + 2 * length;
	}
	
	
}
