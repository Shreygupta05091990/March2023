package com.basic.Strings;

import java.util.Scanner;

public class ReverseWordsOfSentence2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String  inp_String = scn.nextLine();
		
		reverseEachWordOfSentence(inp_String);
		
		
	}

	private static void reverseEachWordOfSentence(String inp_String) {
		
		String rev_String = "" ; 
		String[] words = inp_String.trim().split(" ");
		for( String w : words ) {
			
			for(int i = w.length()-1 ; i>=0   ; i-- ) {
				
				rev_String += w.charAt(i);
			}
			
			rev_String +=" ";
			
		}
		
		
		System.out.println("The sentence  with reversed words is : -- "+ rev_String);
		
	}
	
	
	
	
}
