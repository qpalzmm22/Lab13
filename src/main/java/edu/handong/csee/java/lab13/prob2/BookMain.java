package edu.handong.csee.java.lab13.prob2;

public class BookMain {

	public static void main(String[] args) {
		Book[] bookList = new Book[3];
		bookList[0] = new Book("Simple Book");
		bookList[1] = new Science("Hello Physucs!", "ScienceWorld");
		bookList[2] =  new History("What Is history?", "E.H.Carr"); 
		
		for(Book b : bookList) {
			b.printBookInfo();
		}
	}

}
