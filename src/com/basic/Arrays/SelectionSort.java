package com.basic.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex >= 0; lastUnsortedIndex--) {

			int largestValueatIndex = 0;
			for (int i = 1; i <= lastUnsortedIndex; i++) {
				if (intArray[i] > intArray[largestValueatIndex]) {
					largestValueatIndex = i;
				}

			}

			swap(intArray, largestValueatIndex, lastUnsortedIndex);
		}
		for (int i=0 ;  i<intArray.length-1 ; i++) {
			
			System.out.println("The  array element at Index " + i + " "  + intArray[i]);
		}
	}
	
	
	public static void swap(int[] array, int i, int j) {

		if (i == j) {
			return;
		}
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

}
