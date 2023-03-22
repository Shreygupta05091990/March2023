package com.basic.Numbers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateInArray {
	
	public static void main(String[] args) {
		
		Integer[] numbers= new Integer[] {10,20,10 ,30,44,54,44,67};
		duplicate(numbers); //  Checking the duplicate with conventional way of adding them into the set.
		
		// Removing Duplicates with Java 8 Streams(only contains  Unique elements)
		List<Integer>  arrayList      = Arrays.asList(numbers).stream().distinct().collect(Collectors.toList());
		System.out.println("The list with unique elements is : -" + arrayList);
		}

    // Method to check duplicates 
	private static void duplicate(Integer[] numbers) {
		
      Set<Integer>  number_set = new HashSet<Integer>() ;
      
      for (int j = 0; j < numbers.length; j++) {
    	  
    	  
    	  if (!number_set.add(numbers[j])) {
    		  
    		  System.out.println("The Duplicates are :- " + numbers[j]) ;
    	  }
      }
	}
}