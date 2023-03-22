package com.basic.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] intArray = { 20, 35 , -15, 7, 55, 1, -22 };
		
//		 { 20, -15,35,  7, 55, 1, -22 }   i=2
		/* 
		1. The below outer loop works on the assumption that element[0]  comes in sorted partition
		 	it  starts from firstUnsortedIndex and goes on till the length (with +1 increment)
		2.  Rest all comes under  unsorted partition.
		3.  so Index[0] comes under sorted partition and from Index[1-->till the end] under 
		   unsorted partition.
		4 . Working of Inner loop.
			just after the sorted group,first element(new element) of unsorted group , which needs 
			to be inserted at the right place in the newly extended sorted group.
		    
		5. The newElement needs to compared  and shifted with each of the elements inside sorted partition
		   till we reach the front of the array. 
		6. The inner loop  works on traversing in sorted set , moves from Right to Left 
		
		*/
		for( int firstUnsortedIndex =1;  firstUnsortedIndex < intArray.length; firstUnsortedIndex++  ) {
			
			int newElement = intArray[firstUnsortedIndex]; // Storing the element to be inserted in new element
			int i; // declaring outside the inner loop as needed outside the inner loop.
			
			for(   i= firstUnsortedIndex ; i>0 &&  intArray[i-1] > newElement ;firstUnsortedIndex--  ) {
				
				intArray[i]=intArray[i-1];
			}
			 
			intArray[i]=newElement; 
		}

		
		
		
		
	}

}
