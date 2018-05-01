package edu.handong.csee.java.lab13.prob4; // makes it a package

public class Dog extends Animal implements Pet{	// This class has a superclass of Animal and interface of Pet 
	public String getFood() {// this method is from Pet which gives a string of food that dog eats
		return "(Dog) " + "Saussage";  // returns the String of dog's food
	}
}
