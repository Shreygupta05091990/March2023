package com.basic.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class RemovingDigitsfromString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String inputString = scn.nextLine();

		stringwithoutDigits(inputString);

	}

	private static void stringwithoutDigits(String input) {

		StringBuffer unsorted_StringBuffer = new StringBuffer();
		
		StringBuffer unsorted_NumbersBuffer = new StringBuffer();

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isAlphabetic(ch)) {

				unsorted_StringBuffer.append(ch);

			} else if (Character.isDigit(ch)) {
				unsorted_NumbersBuffer.append(ch);
			}
			else System.out.println("Invalid String");

		}
		String sorted = new String(unsorted_StringBuffer);
		char[] arr = sorted.toCharArray();    // String.tocharArray  
		Arrays.sort(arr);
		System.out.println(unsorted_NumbersBuffer.append(arr));

	}
}