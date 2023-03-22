package com.basic.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class SplitNumbersAndCharacters {

	public static void main(String[] args) {

		
		Scanner scn = new Scanner(System.in);
		String input = scn.next();
		
		splitString(input);

	}

	private static void splitString(String str) {

		StringBuffer num = new StringBuffer();
		StringBuffer alpha = new StringBuffer();
		StringBuffer special = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)))
				num.append(str.charAt(i));	
			else if (Character.isAlphabetic(str.charAt(i)))
				alpha.append(str.charAt(i));
			else
				special.append(str.charAt(i));
		}
		String string = new String(alpha);
		char[] sortedString = sortString(string);

		for (char ch : sortedString) {

			System.out.print(ch);
		}
        System.out.print(" "+num + " " +special);
        
        
	}

	private static char[] sortString(String alpha1) {

		char[] arr = alpha1.toCharArray();

		Arrays.sort(arr);

		return arr; // returns char array of sorted string 

	}
}
