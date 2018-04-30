package edu.handong.csee.java.lab13.prob2;	// makes this class a package of following name

public class Book {	// this class is the root class of other classes in this package
	private static int IDcount = 0 ;	// restores the number of books created by static memory
	private int ID;	// the distinguishing ID
	private String name;	// name of this book
	public Book() {	//default constructor
		IDcount++;	// increase IDcount
		ID = IDcount;	// sets ID by IDcount
		name = "no Name"; 	// default this.name == "no Name"
	}
	public Book(String name) {	// constructor with parameter of String
		IDcount++;	// increase IDcount
		ID = IDcount;	// sets ID by IDcount
		this.name = name;	// the given string becomes this.name
	}
	
	public void printBookInfo() {	// prints info about the book
		System.out.println("<<<"+ this.getClass().getSimpleName() + ">>>");	// print the name of the class
		System.out.println("\tId: " + ID);	//print the Id of this book
		System.out.println("\tBook Name: " + name);	// print the name of this book
	}
}
