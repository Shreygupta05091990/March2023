package com.basic.Strings;

import java.util.Scanner;

public class RemovingWhiteSpacesFromString {
	
	
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String inputString=scn.nextLine();
		
		withoutSpaces(inputString);
		
		
				
		
		
		
		
	}

	private static void withoutSpaces(String input) {
		
		for(int i=0 ;i < input.length(); i++) {
			char ch= input.charAt(i);
		if (ch!=' ') {
			
			System.out.print(ch);
		}
	}

	}
}
