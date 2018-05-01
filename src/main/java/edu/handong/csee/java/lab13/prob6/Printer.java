package edu.handong.csee.java.lab13.prob6;


public class Printer {

	public static void print(Object other) {
		String str = other.toString();
		if(other instanceof UpPoint)
			str = str.toUpperCase();
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		UpPoint str1 = new UpPoint(3, 3);
		DownPoint str2 = new DownPoint(2, 5);
		DownPoint str3 = new DownPoint(4, 7);
		UpPoint str4 = new UpPoint(9, 12);
		
		print(str1);
		print(str2);
		print(str3);
		print(str4);
	}

}
