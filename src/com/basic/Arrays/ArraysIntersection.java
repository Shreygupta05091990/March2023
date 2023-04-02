package com.basic.Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraysIntersection {

	public static void main(String[] args) {

		
		
		
		List<Integer> arrL1 = Arrays.asList( 7, 1, 5, 2, 3, 6);
		List<Integer> arrL2 = Arrays.asList(3, 8, 6, 20, 7);
		
		
	Set<Integer> set=	arrL2.stream().filter(arrL1::contains).sorted().collect(Collectors.toSet());
	System.out.println(set);	
	
	
	Integer arr1[] = { 7, 1, 5, 2, 3, 6 };
	Integer arr2[] = { 3, 8, 6, 20, 7 };
	List<Integer> union_List= Stream.of(arr1,arr2).flatMap(Stream::of).distinct().collect(Collectors.toList());
		
     System.out.println(union_List);
	
}
	
		
	}


