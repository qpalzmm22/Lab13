package edu.handong.csee.java.lab13.prob4;

import java.util.*;

public class Master {
	
	public static void feed(Pet pet) {
		System.out.println("feed: " + pet.getFood()); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the cat name and dog name: ");
		String catName = keyboard.next();
		String dogName = keyboard.next();
		

		Cat kitty = new Cat();
		Dog doggy = new Dog();
		
		kitty.setName(catName);
		doggy.setName(dogName);
		System.out.println("Name: " + kitty.getName());
		feed(kitty);
		System.out.println("Name: " + doggy.getName());
		feed(doggy);
		keyboard.close();
	}

}
