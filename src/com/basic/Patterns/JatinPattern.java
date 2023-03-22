package com.basic.Patterns;

public class JatinPattern {

	public static void main(String[] args) {

		int rows, spaces, stars;

		for (rows = 1; rows <= 4; rows++) {


			for (spaces = 1; spaces <= 4; spaces++) {

				System.out.print(" ");
			}
			for (stars = 1; stars <= rows; stars++) {

				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 8; i++)
			System.out.print("*");

	}

}
