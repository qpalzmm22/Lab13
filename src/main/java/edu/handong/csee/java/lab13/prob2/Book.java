package edu.handong.csee.java.lab13.prob2;

public class Book {
	private int ID = 0 ;
	private String name;
	public Book() {
		ID++;
		name = "no Name"; 
	}
	public Book(String name) {
		ID++;
		this.name = name;
	}
}
