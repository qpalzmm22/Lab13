package edu.handong.csee.java.lab13.prob2;

public class History extends Book{
	String author;
	public History() {
		super();
		this.author = "UNKNOWN";
	}
	public History(String name, String author) {
		super(name);
		this.author = author;
	}
}
