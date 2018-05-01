package edu.handong.csee.java.lab13.prob5; // makes it a package

import java.util.*;	// import to use nextInt()

public class Prob5 { // class for prob5.
					// contains equalsTo(), print2DArray(), main() methods

	public static boolean equalsTo(int[][] x, int[][] y) {	// check if the given arrays are approximately identical
		if(x.length != y.length)	// if # of rows are different
			return false;	//return false
		int diffCount = 0;	// variable to count the number of different numbers
		for(int i = 0; i < x.length ; i++) {	// for number of rows
			for(int j = 0 ; j < x[0].length; j++) { // for number of columns
				if(x[i][j] != y[i][j])	// check if each elements in the arrays are different 
					diffCount++;	// if so, increase diffCount
			}
		}
		if(diffCount > 3)	// if diffCount is bigger than 3 
			return false;	// return false
		return true;		// if not, return true
	}
	public static void print2DArray(int[][] array2D, int row, int col) {	// prints the array given array, row and col
		for(int i = 0; i < row; i++) {	//for number of rows
			for(int j = 0; j < col; j++ ) {	//for number of columns
				System.out.print(array2D[i][j] + " ");	// print the each element
			}
			System.out.println();	// print new line after each row
		}
		System.out.println();	// print new line after printing everything
	}
	
	public static void main(String[] args) {	// main method to check if it's working
		Scanner keyboard = new Scanner(System.in);	// instantiate to use nextInt()
		
		System.out.print("Enter row size(maximum 5): ");	// ask user for row size for x
		int x_row = keyboard.nextInt();						// saves the input of row size for x
		System.out.print("Enter column size(maximum 5): ");	// ask user for col size for x
		int x_col = keyboard.nextInt();						// saves the input of col size for x
		System.out.print("Enter row size(maximum 5): ");	// ask user for row size for y
		int y_row = keyboard.nextInt();						// saves the input of row size for y
		System.out.print("Enter column size(maximum 5): ");	// ask user for col size for y
		int y_col = keyboard.nextInt();						// saves the input of col size for y
		
		int[][] x = new int[x_row][x_col];	// instantiate 2D arrays with row of x_row and x_col
		int[][] y = new int[y_row][y_col];	// instantiate 2D arrays with row of y_row and y_col
		
		System.out.print("Enter List1: ");	// ask user to put the elements of x
		for(int i = 0; i < x_row ; i++) {	// for number of row 
			for(int j = 0; j < x_col; j++ ) { // for number of col
				x[i][j] = keyboard.nextInt();	//save each elements to according place
			}
		}
		
		System.out.print("Enter List2: ");	// ask user to put the elements of y
		for(int i = 0; i < y_row ; i++) {	// for number of row
			for(int j = 0; j < y_col; j++ ) {	// for number of col
				y[i][j] = keyboard.nextInt();	//save each elements to according place
			}
		}
		
		print2DArray(x, x_row, x_col);	//prints x
		print2DArray(y, y_row,y_col);	//prints y
		
		if(equalsTo(x, y))	// check if it's approximately identical
			System.out.println("The two arrays are approximately identical."); // if so, print so
		else	//if not
			System.out.println("The two arrays are not identical");	// print so
		
		keyboard.close(); // close keyboard for safety
	}

}
