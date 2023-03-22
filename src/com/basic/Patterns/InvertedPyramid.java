package com.basic.Patterns;

import java.util.Scanner;

public class InvertedPyramid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int spaces = 0;
		int star = n;

		// 3 For Looops are used here 
		// one for spaces ,
		// one for Stars ,
		// one for Line change
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");

			}

			for (int j = 1; j <= star; j++) {
				System.out.print("* ");

			}

			spaces++;
			star--;
			System.out.println();
		}

	}

}
