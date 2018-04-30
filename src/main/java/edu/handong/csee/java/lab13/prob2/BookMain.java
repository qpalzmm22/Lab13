package edu.handong.csee.java.lab13.prob2;	// makes this class a package of following name

public class BookMain {	// Tests the Book, History and Science classes

	public static void main(String[] args) {	// main method to test 
		Book[] bookList = new Book[3];	// create an array to store 3 books
		bookList[0] = new Book("Simple Book");	// Instantiate a book with name of "Simple Book"
		bookList[1] = new Science("Hello Physucs!", "ScienceWorld"); // instantiate a science book with name of "Hello Physics!" and the publisher of "ScienceWorld"
		bookList[2] =  new History("What Is history?", "E.H.Carr"); // instantiate a history book with name of "What Is history?" and the author of "E.H.Carr"
		
		for(Book b : bookList) {	// for all the books
			b.printBookInfo();	//print the information of the books
		}
	}

}
