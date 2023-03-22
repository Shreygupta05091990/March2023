package com.basic.Strings;

import java.util.HashMap;

public class AnagramStrings {

	public static void main(String[] args) {
		 
		String  first="now";
		String  Second="won";
		isAnagram(first,Second);
		   
		
	}

	private static void isAnagram(String first, String second) {
		
		
		
		if(first.length()!=first.length()) {
		
		
			System.out.println("The provided Strings are  not  Anagram");
		}
		else {
		
HashMap<Character, Integer>  mapOne = createKeysMap(first.toCharArray());
HashMap<Character, Integer>  mapTwo = createKeysMap(second.toCharArray());
		if(mapOne.equals(mapTwo)) {
			
			
			System.out.println("The provided Strings are anagrams");
		}
		else {
			
			System.out.println("The provided Strings are not anagrams");
		}
		
		
		
		}	
	}

	private static HashMap<Character, Integer> createKeysMap(char[] cs) {

		int length = cs.length;
//		System.out.println("The length of First String " +  length);

		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		for (int i = 0; i < length; i++) {

			if (hmap.containsKey(cs[i])) {
				hmap.put(cs[i], hmap.get(cs[i]) + 1);

			} else {
				hmap.put(cs[i], 1);

			}

		}
		return hmap;


	}

	/*
	 * private static boolean areEqual(HashMap<Character, Integer> mapOne ,
	 * HashMap<Character, Integer> mapTwo) {
	 * 
	 * if (mapOne.size()!=mapTwo.size()) { return false ; }
	 * 
	 * return
	 * mapOne.entrySet().stream().allMatch(obj->obj.getValue().equals(mapTwo.get(obj
	 * .getKey())));
	 * 
	 * 
	 * }
	 */
}

