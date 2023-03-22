package com.basic.Strings;

import java.util.Scanner;

public class RotationsOfAString {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String input = scn.next();

		rotations(input);

	}

	private static void rotations(String input) {
		int length = input.length();
		StringBuffer sb = new StringBuffer(input);
		System.out.println(sb.append(input));

		for (int i = 0; i < length; i++) {

			for (int j = 0; j !=length; j++)
				System.out.print(sb.charAt(i + j));
			System.out.println();

		}

	}

}