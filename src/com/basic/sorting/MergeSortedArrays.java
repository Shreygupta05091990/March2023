package com.basic.sorting;

public class MergeSortedArrays {

	public static void main(String[] args) {
		
		int[] array1 = {2,5,6,10 ,12,13};
		int[] array2 = {1,3,7};
		
		
		int merged[] = mergeTwoSortedArrays(array1,array2);
		for (int i = 0; i < merged.length; i++) {
			System.out.print(merged[i] +" ");
		}
		
		

	}

	private static int[] mergeTwoSortedArrays(int[] array1, int[] array2) {
		int[] merged = new int[array1.length + array2.length]; // get the size of new array 
		int i = 0;
		int j=0;
		int k=0; // index for new merged array 
		while(i<array1.length && j<array2.length)
		{
			if (array1[i] < array2[j]) {
				merged[k] = array1[i];
				i++;
				k++;
				
			}
			else {
				merged[k] = array2[j];
				j++;
				k++;
				
				
			}
		}
		while(i<array1.length ) {
			
			merged[k] = array1[i];
			i++;
			k++;
			
		}
		while(j<array2.length ) {
			merged[k] = array2[j];
			j++;
			k++;
		}
		return merged ; 
	}

}
