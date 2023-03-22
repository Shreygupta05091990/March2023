package com.basic.Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
/*
 Fill the map  with the frequwncy of Characters 
 Filter those records of Map where value  is 1 , to another Map 
 
 
 */



public class NonRepeatedCharactersFromString {
	
	static <Character, Integer> Map<Character, Integer> filterByValue(Map<Character, Integer> map, Predicate<Integer> predicate) {
	    return map.entrySet()
	            .stream()
	            .filter(entry -> predicate.test(entry.getValue()))
	            .collect(Collectors.toMap(Entry::getKey, Entry::getValue));
	}
	
	
	
	
	
	
	
	private static HashMap<Character, Integer> non_Repeated_Chars_String(String input_String) {
		
		HashMap<Character, Integer> hmap= new HashMap<Character, Integer>();
		for(int i=0;i<input_String.length();i++)
		{
			char ch=input_String.charAt(i);
			if (hmap.containsKey(ch)) {
				
				hmap.put(ch, hmap.get(ch)+1);
			}else 
			{
			  hmap.put(ch, 1)	;
				
			}
		
		}
		
		
		HashMap<Character , Integer > filteredMap = (HashMap<java.lang.Character, java.lang.Integer>) filterByValue(hmap, value -> value ==1);
		
		return  filteredMap;
	  }
	
	
	
	
	
	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	 String input_String = sc.nextLine();
	 
	 HashMap<Character, Integer>  freq_map =   non_Repeated_Chars_String(input_String);
	 
	 ArrayList<Character> unique_Characters = new ArrayList<Character>();
	 
	for (Entry<Character, Integer> entry : freq_map.entrySet()) {
		
		if(entry.getValue()==1) {
			unique_Characters.add(entry.getKey());
		}
		
		
	}
	 
		System.out.println(unique_Characters.toString());
	
		
	}

	

}
