package edu.handong.csee.java.lab13.prob4;	// makes it a package

import java.util.*;	// import to use next()

public class Master {// a class to contain main method and feed method to test the program
	
	public static void feed(Pet pet) {	// this method feeds a input pet
		System.out.println("feed: " + pet.getFood()); 	// print out according to pet's getFood()
	}
	public static void main(String[] args) {	// the main method to test the program
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);	// instantiate Scanner to user next() 
		
		System.out.print("Enter the cat name and dog name: ");	//ask user for cat and dog's name
		String catName = keyboard.next();	// save the first input at catName
		String dogName = keyboard.next();	// save the second input at dogName
		

		Cat kitty = new Cat();	// Instantiate Cat
		Dog doggy = new Dog();	// Instantiate Dog
		
		kitty.setName(catName);	// set cat's name as given by user
		doggy.setName(dogName);	// set dog's name as given by user
		System.out.println("Name: " + kitty.getName());	// print the cat's name
		feed(kitty);	// feed the kitty
		System.out.println("Name: " + doggy.getName());	// print the dog's name
		feed(doggy);	// feed the doggy
		keyboard.close();	// close keyboard for safety
	}

}
