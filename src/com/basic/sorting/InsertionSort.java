package com.basic.sorting;

public class InsertionSort {

	
	public static void main(String[] args) {
		
		int[] array = {20,35 ,-15 , 7,55,1,-22};
		
		/*
		
		Logic : Assume sorted partition has 1 starting  element 
		         We have to insert the element into the sorted partition  and 
		         then move the firstUnsortedIndex towards the right starting 
		        from the first index .
		        UnsortedIndex keeps moving forward .  
		        WE compare the last element of sorted partition with the element at unsorted index .
		        
		        Gradually , sorted partition gorws in size from left to right .
		  
	    */
		
		for(int firstUnsortedIndex =1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
			int newElement= array[firstUnsortedIndex];
			int i;
			for (i= firstUnsortedIndex ;i > 0 && array[i-1]> newElement  ;i--) {
				
				array[i]= array[i-1];
				
			} 
			array[i] = newElement;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
			
		}	
	}
	
	
	
}
