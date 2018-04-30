package edu.handong.csee.java.lab13.prob2; // makes this class a package of following name

public class Science extends Book{	 // this class has a superclass of Book
	private String publisher;		// a variable to store publisher's name
	public Science() {				// default constructor
		super();					// use the superclass' default constructor
		this.publisher = "UNKNOWN";	// default name of publisher's name is "UNKNOWN" 
	}
	public Science(String name, String publisher) {// a constructor with 2 String parameters
		super(name);	// use the superclass' constructor
		this.publisher = publisher;	// sets this.publisher by the second parameter
	}
	public void printBookInfo() {	//prints the info of the book
		super.printBookInfo();	// use the superclass' printBookInfo()
		System.out.println("\tPublisher: " + publisher);	// print the info of the publisher
	}
}

