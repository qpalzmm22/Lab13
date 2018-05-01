package edu.handong.csee.java.lab13.prob4;	// makes it a package

public class Cat extends Animal implements Pet{	// This class has a superclass of Animal and interface of Pet 
	public String getFood() {	// this method is from Pet which gives a string of food that cat eats
		return "(Cat) " + "Fish"; 	// returns the String of cat's food
	}

}
