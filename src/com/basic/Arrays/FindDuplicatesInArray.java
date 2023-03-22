package com.basic.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesInArray {



   public static void main(String[] args) {
	   
	   
	   
	   
	int[]  array= {1,2,3,2,5,6,7,8,9,3};
	
	
	
	Set<Integer>  set = new HashSet<Integer>();
	List<Integer> list = new ArrayList<Integer>();
	
	for(int i=0; i<array.length;i++) {
		
		if (set.add(array[i])==false) {
			
			list.add(array[i]);
			
			
		}
		
		
	}
	System.out.println("The list of duplicate/repetitive elements from the array array is "+ list);
	
}
	




}
