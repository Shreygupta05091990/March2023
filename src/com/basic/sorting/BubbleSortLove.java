package com.basic.sorting;

public class BubbleSortLove {

	static void swap(int[] array, int i, int j) {

		int temp = array[i];
		array[i] = array[i + 1];
		array[i + 1] = temp;

	}

	public static void main(String[] args) {

		int[] arr = { 2, -2, 3, 6, 4, -78 , 56};

		for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex; i++) {

				if (arr[i] > arr[i + 1]) {

					swap(arr, i, i + 1);
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
