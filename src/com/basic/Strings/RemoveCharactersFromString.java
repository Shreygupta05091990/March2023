package com.basic.Strings;

import java.util.Scanner;

public class RemoveCharactersFromString {

	
	
	public static void main(String[] args) {
		
		

		Scanner scn = new Scanner(System.in);
		String input = scn.nextLine();
			
		
		
//		String input_String = input.replaceAll("[aeiou:]", "");
		String input_String = input.replace("S" , "R");
		
		
		System.out.println( "The revised string is - " + input_String);
	}
	
	
}
