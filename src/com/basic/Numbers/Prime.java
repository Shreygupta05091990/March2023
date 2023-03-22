package com.basic.Numbers;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number to be checked?");
		int input = scn.nextInt();
		int flag = 0;
		for (int i = 2; i <= Math.sqrt(input); i++) {

			if (input % i == 0 && i != input) {

				flag = 1;
				break;
			}

		}
		if (flag == 1) {
			System.out.println("The entered number is not  Prime");

		} else {
			System.out.println("The entered number is   Prime");
		}

	}

}
