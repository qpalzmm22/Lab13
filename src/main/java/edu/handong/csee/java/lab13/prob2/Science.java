package edu.handong.csee.java.lab13.prob2;

public class Science extends Book{
	String publisher;
	public Science() {
		super();
		this.publisher = "UNKNOWN";
	}
	public Science(String name, String publisher) {
		super(name);
		this.publisher = publisher;
	}
}
