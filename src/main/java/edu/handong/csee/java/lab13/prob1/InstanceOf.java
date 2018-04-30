package edu.handong.csee.java.lab13.prob1; // makes it a package

public class InstanceOf {	// This class tests the relationships between Friend, SchoolFriend and ClassFriend

	public static void WhatFriend(Friend aFriend) {	// static : usuable without instanciation, 
													// check if the parameter(Friend) is school friend, class friend
													// or just a friend
		if(aFriend instanceof ClassFriend) {		// if the friend is ClassFriend
			System.out.println("Class Friend!");	// tell the user that he/she is ClassFriend
		}
		else if (aFriend instanceof SchoolFriend) {	// if the friend is SchoolFriend
			System.out.println("School Friend!");	// tell the user that he/she is SchoolFriend
		}
		else {										// if the friend is neither ClassFriend nor SchoolFriend(which makes he/she just a freind)
			System.out.println("Just a Friend!");	// tell the user that he/she is just a friend
		}
	}
	public static void main(String[] args) {		// main method to test if it's working
		// TODO Auto-generated method stub
		Friend friend1 = new Friend();				// Makes a instance of a Friend
		Friend friend2 = new SchoolFriend();		// Makes a instance of SchoolFriend
		Friend friend3 = new ClassFriend();			// Makes a instance of ClassFriend
		
		InstanceOf.WhatFriend(friend1);				// Check what kind of friend friend1 is
		InstanceOf.WhatFriend(friend2);				// Check what kind of friend friend2 is
		InstanceOf.WhatFriend(friend3);				// Check what kind of friend friend3 is
	}

}
