package com.basic.Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class AllSubstringsinString {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String inputString = in.next();

		findSubString(inputString.toCharArray());
	}

	private static void findSubString(char[] char_Array) {

		int length = char_Array.length;
		for (int i = 0; i < length; i++) {

			StringBuffer sb = new StringBuffer();
			sb.append(char_Array[i]);
			
			// it helps in printing only the single character, other substrings with single char will get missed
			System.out.println(sb); 
			

			for (int j = i + 1; j < length; j++) {

				System.out.println(sb.append(char_Array[j]));

			}

		}

	}

}
