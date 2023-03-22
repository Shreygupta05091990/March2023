package com.basic.Strings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;import javax.security.auth.callback.CallbackHandler;

public class ConsecutiveCharactersFromString {

	private static List<String> getConsecutiveOccurrenceOfChar(char[] string_characters) {

		List<String> char_counts = new ArrayList<String>();
		char first_Character= string_characters[0];
		int occurence = 1;
		for (int i = 1; i < string_characters.length; i++) {
			char to_be_compared_character = string_characters[i];
			if (first_Character== to_be_compared_character) {
				occurence++;

			} else {// 
				char_counts.add(first_Character+ ":"    +occurence  );
				occurence = 1; // reset the occurence for new character to 1
				first_Character = to_be_compared_character; // Re-initialize the current with next different character
			}

		}

//		char_counts.add(first_Character+ ":"    +occurence  );
		return char_counts;  //  return back the Arraylist to caller method 

	}
	
	 

	public static void main(String[] args) {

		String input_String = "AAAAAAB";
	System.out.println(getConsecutiveOccurrenceOfChar(input_String.toCharArray()));
		System.out.println(getConsecutiveOccurenceInMap(input_String.toCharArray()));

	}



	private static HashMap<Character, Integer> getConsecutiveOccurenceInMap(char[] charArray) {

		HashMap<Character, Integer> count_Map = new HashMap<Character, Integer>();
		char first = charArray[0];
		int occurence = 1;
		for (int index1 = 1; index1 < charArray.length; index1++) {
			char new_char = charArray[index1];
			if (first == new_char) {

				occurence++;
			} else {
				count_Map.put(first, occurence);
				occurence = 1;
				first = new_char;

			}

		}

		count_Map.put(first, occurence);
		return count_Map;
	}

}
