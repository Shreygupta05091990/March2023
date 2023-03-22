package com.basic.Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromicSubStrings {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String input = scn.next();
		ArrayList<String> substrings = new ArrayList<String>();
		ArrayList<String> palindromicSubstring = new ArrayList<String>();
		for (int i = 0; i < input.length() - 1; i++) {
			for (int j = i + 1; j <= input.length(); j++) {
				String ss = input.substring(i, j); 
				substrings.add(ss);
				if(isPalindrome(ss)==true){
					
					palindromicSubstring.add(ss);
				}
			}

		}
		System.out.println(substrings);
		System.out.println("------------------------------------");	
		System.out.println(palindromicSubstring);
	}

	public static boolean isPalindrome(String input) {

		int lastCharIndex = input.length() - 1;
		for (int i = 0; i <= lastCharIndex / 2; i++) {

			if (input.charAt(i) != input.charAt(lastCharIndex - i))
				return false;
		}

		return true;

	}

}
