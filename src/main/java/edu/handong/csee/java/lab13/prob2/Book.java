package edu.handong.csee.java.lab13.prob2;

public class Book {
	private static int IDcount = 0 ;
	private int ID;
	private String name;
	public Book() {
		IDcount++;
		ID = IDcount;
		name = "no Name"; 
	}
	public Book(String name) {
		IDcount++;
		ID = IDcount;
		this.name = name;
	}
	
	public void printBookInfo() {
		System.out.println("<<<"+ this.getClass().getSimpleName() + ">>>");
		System.out.println("\tId: " + ID);
		System.out.println("\tBook Name: " + name);
	}
}
