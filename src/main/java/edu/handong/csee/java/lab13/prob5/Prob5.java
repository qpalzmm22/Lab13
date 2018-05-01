package edu.handong.csee.java.lab13.prob5;

import java.util.*;

public class Prob5 {

	public static boolean equalsTo(int[][] x, int[][] y) {
		if(x.length != y.length)
			return false;
		int diffCount = 0;
		for(int i = 0; i < x.length ; i++) {
			for(int j = 0 ; j < x[0].length; j++) {
				if(x[i][j] != y[i][j])
					diffCount++;
			}
		}
		if(diffCount > 3)
			return false;
		return true;
	}
	public static void print2DArray(int[][] array2D, int row, int col) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++ ) {
				System.out.print(array2D[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter row size(maximum 5): ");
		int x_row = keyboard.nextInt();
		System.out.print("Enter column size(maximum 5): ");
		int x_col = keyboard.nextInt();
		System.out.print("Enter row size(maximum 5): ");
		int y_row = keyboard.nextInt();
		System.out.print("Enter column size(maximum 5): ");
		int y_col = keyboard.nextInt();
		
		int[][] x = new int[x_row][x_col];
		int[][] y = new int[y_row][y_col];
		
		System.out.print("Enter List1: ");
		for(int i = 0; i < x_row ; i++) {
			for(int j = 0; j < x_col; j++ ) {
				x[i][j] = keyboard.nextInt();
			}
		}
		
		System.out.print("Enter List2: ");
		for(int i = 0; i < y_row ; i++) {
			for(int j = 0; j < y_col; j++ ) {
				y[i][j] = keyboard.nextInt();
			}
		}
		
		print2DArray(x, x_row, x_col);
		
		print2DArray(y, y_row,y_col);
		
		if(equalsTo(x, y))
			System.out.println("The two arrays are approximately identical.");
		else
			System.out.println("The two arrays are not identical");
		
		keyboard.close();
	}

}
