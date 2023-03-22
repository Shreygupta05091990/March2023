package com.basic.sorting;

public class InsertionSortRecursion {

	public static void main(String[] args) {
		int[] array = {20,35 ,-15 , 7,55,1,-22};
		
		
		

	}

	private static void insertionSort(int[] array,  int numItems) {
	  
		if (numItems<2) {
			
			return ;
		}
		
		insertionSort(array, numItems-1);
		int newElement = array[numItems-1];
		for(int firstUnsortedIndex =1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
			int newElement= array[firstUnsortedIndex];
			int i;
			for (i= firstUnsortedIndex ;i > 0 && array[i-1]> newElement  ;i--) {
				
				array[i]= array[i-1];
				
			} 
			array[i] = newElement;
		}
		System.out.println("Result of Call when Number of Items --" + numItems);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print(", ");
			
		} 
		System.out.println("");
		System.out.println("------------------------------------------------");
		
	}

}
