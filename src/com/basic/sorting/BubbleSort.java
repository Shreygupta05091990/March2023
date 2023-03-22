package com.basic.sorting;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
	
	
	
	// Used for swapping ith and jth elments of an array 
	static void swap(int[] arr, int i , int j ) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	
	
	
	 static boolean isSmaller(int[] arr , int i , int j ) {
	
		 if (arr[j]<arr[i]) {
		 return true;
		 }
		 else 
			 return false ;
		
		
	}
	
	
	
	static void     bubbleSort( int[] arr) {
		
		for (int itr = 1 ;itr <= arr.length-1; itr++) {
			for(int j =0 ;j<arr.length-itr ; j++) {
				
				if (isSmaller(arr, j, j+1)) {
					swap(arr, j, j+1);
					
				}
				
				
			}
			
		}
		
	
	for(int a:arr)
		System.out.println(a);
	
		
		
	}

	
	
	
	public static void main(String[] args) {
		
		int [] arr = {2,-2,3,6,4};
		bubbleSort(arr);
		
		
		
		
		
		
		
		
		
		
	}
	
	
}




