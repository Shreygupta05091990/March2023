package com.basic.Numbers;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number ??");
		int number = scn.nextInt();
		if (palindrome(number) == number) {

			System.out.println("The given number is a Palindrome number ");

		} else
			System.out.println("The given number is not a Palindrome number ");

	}

	private static int palindrome(int number) {

		int r = 0, total = 0;

		while (number > 0) {
			r = number % 10;
			total = total * 10 + r;
			number = number / 10;

		}

		return total;
	}

}
