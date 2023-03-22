package com.basic.Strings;

import java.util.Scanner;

public class ReverseEachWordOfSentence1 {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		String Original_String = scn.nextLine();
		String words[] = Original_String.split(" ");
		String  reversedString =""; // Full reverse String intitialised as empty String
		for (int i = 0; i < words.length; i++) {
		
			String word = words[i]; // Word by word reverse 
			String reverse_word="";
		for (int j = word.length()-1; j >=0 ; j--) {
			
			reverse_word= reverse_word+word.charAt(j);
			
		}
		reversedString= reversedString + reverse_word +" ";
		
	}
		System.out.println("The Reversed Sentence is --->" + reversedString);
		
		
		
	}
	
	
	
	
	
	
	
}
