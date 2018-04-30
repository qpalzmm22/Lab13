package edu.handong.csee.java.lab13.prob2;	// makes this class a package of following name

public class History extends Book{	// this class has a superclass of Book
	private String author;	// a variable to store author's name
	public History() {	// default constructor
		super();	// use the superclass' default constructor
		this.author = "UNKNOWN"; // default name of author's name is "UNKNOWN" 
	}
	public History(String name, String author) {	// a constructor with 2 String parameters 
		super(name);	// use the superclass' constructor
		this.author = author;	// sets this.author by the second parameter
	}
	public void printBookInfo() {	// prints the info of the book
		super.printBookInfo();	// use the superclass' printBookInfo()
		System.out.println("\tAuthor: " + author); // print the info of the author
	}
	
}
