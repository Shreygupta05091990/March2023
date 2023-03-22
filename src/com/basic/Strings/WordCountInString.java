package com.basic.Strings;

import java.util.Scanner;

public class WordCountInString {

	 public static void main(String[] args) {

//		Scanner scn = new Scanner(System.in);
//		String input_String = scn.nextLine();
		String input_String =" I am a good ";
		int words = wordCount(input_String);
		System.out.println("The number of words are : " + words);

	}

	private static int wordCount(String input_String) {
		int c = 0;

		char[] ch = new char[input_String.length()];
		System.out.println(input_String.length());
		for (int i = 0; i < input_String.length(); i++) {
			ch[i] = input_String.charAt(i);

			if (((ch[i] != ' ' && (i > 0)) && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0))) {
// --->((ch[i] != ' ' && (i > 0)) && (ch[i - 1] == ' '))  ---> 
				c++;

			}

		}
		return c;

	}
}
