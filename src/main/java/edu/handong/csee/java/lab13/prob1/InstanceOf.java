package edu.handong.csee.java.lab13.prob1;

public class InstanceOf {

	public static void WhatFriend(Friend aFriend) {
		if(aFriend instanceof ClassFriend) {
			System.out.println("Class Friend!");
		}
		else if (aFriend instanceof SchoolFriend) {
			System.out.println("School Friend!");
		}
		else {
			System.out.println("Just a Friend!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend friend1 = new Friend();
		Friend friend2 = new SchoolFriend();
		Friend friend3 = new ClassFriend();
		
		InstanceOf.WhatFriend(friend1);
		InstanceOf.WhatFriend(friend2);
		InstanceOf.WhatFriend(friend3);
	}

}
