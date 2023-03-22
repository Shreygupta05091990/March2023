package com.basic.Patterns;

import java.util.Scanner;

public class RegularPyramid {

	public static void main(String[] args) {
		int i, j, k;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (i = 1; i <= n; i++) {	

			for (j = n-1; j >= i; j--) {

				System.out.print(" ");
			}
			for (k = 1; k <= i ; k++) {

				System.out.print("* ");
			}
			System.out.println();

		}

	}

}
