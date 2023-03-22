package com.basic.Strings;

import java.util.Scanner;

public class ReverseEntireStrings {

	public static void main(String[] args) {
		
		
		Scanner scn = new   Scanner(System.in);
		
		String oringalString = scn.nextLine();
		scn.close();
		
		String words[] = oringalString.split("\\s");
		String reversedString="";   // Empty container for new reversed String
		System.out.println(words.length);
		
		  for (int i = 0; i < words.length; i++) { 
	            if (i == words.length - 1) 
	                reversedString = words[i] + reversedString; 
	            else
	                reversedString = " " + words[i] + reversedString; 
	        } 

		  
		  System.out.print("Reversed string : " + reversedString);
    }
}
