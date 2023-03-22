package com.basic.Strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* This is an application Of LinkedHashMap - where insertion order is important */


public class FirstNonRepeatedCharacter {

	private static char firstNonRepeatedChar(String input_String) {

		Map<Character, Integer> fm = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < input_String.length(); i++) {
			if (fm.containsKey(input_String.charAt(i))) {

				fm.put(input_String.charAt(i),
						fm.get(input_String.charAt(i)) + 1);

			} else
				fm.put(input_String.charAt(i), 1);

		}

		
		/***************Retrieval from HashMap***********************/
		for (Entry<Character, Integer>  entry: fm.entrySet()) {
			
			if (entry.getValue()==1)
				return entry.getKey();
		}
		
		throw new RuntimeException("didn't find any non repeated character");
		
	}

	public static void main(String[] args) {

		String inputString = null;
		try {
		 inputString = "NNAAAAABEEEFF";}
		catch(NullPointerException e) {
			e.printStackTrace();
			
		}
		char  non_repeated_character= firstNonRepeatedChar(inputString);
		
		System.out.println("The first non- repeated character--> " +non_repeated_character  );
	}

}
