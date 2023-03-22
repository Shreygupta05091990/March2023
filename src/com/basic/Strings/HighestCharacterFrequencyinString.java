package com.basic.Strings;

import java.util.HashMap;
import java.util.Scanner;

public class HighestCharacterFrequencyinString {
	
	
	private static Character characterCount(String orig_String) {
		
		char[] char_Array= orig_String.toCharArray();
		
		HashMap<Character, Integer>  hm = new HashMap<Character, Integer>();
		
		for(char  c : char_Array) {
			
			if(hm.containsKey(c)) {
				
				hm.put(c, hm.get(c)+1);
				
			}
			else {
				
				
				hm.put(c, 1);
			}
			
			
			
			
		}
		
		char mfc= orig_String.charAt(0);
		
		for( Character key : hm.keySet()) {
			if(hm.get(key)  > hm.get(mfc)) {
				mfc = key;
			}
		}
		
		
		
		return mfc;
		
		
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String original_String=in.next();
		char mfc=  characterCount(original_String);
		System.out.println("The character  which has maximum Frequency  in HashMap is  " + "'"+ mfc+"'");
	
	    
	
	
	
	
	}

	
}
