package com.basic.Strings;

import java.util.Arrays;

public class AnagramApproach2 {

	public static void main(String[] args) {
		
		String input1 =  "hsrey";
		String input2 =  "Shrey";
//	String input1=	input3.replaceAll("", "");
		
		
		
		char[]  name1 = input1.toLowerCase().toCharArray();
		char[]  name2 = input2.toLowerCase().toCharArray();
		
		Boolean   anagram  = areAnagrams(name1, name2);
		if (anagram == true ) {
			System.out.println("The provided Strings are  anagrams ");
			
		}else 
			System.out.println("The provided Strings are not anagrams ");
			

	}

	private static Boolean areAnagrams(char[] name1, char[] name2) {
		
		
		if (name1.length != name2.length) {
			
			return false ;
		}else {
			
			Arrays.sort(name1);
			Arrays.sort(name2);
			
			for (int i = 0; i < name2.length; i++) {
				if(name1[i]!= name2[i]) {
					
					return false;
				}
				
			}
			return true ;
		}
		
		
		
		
	}

}
