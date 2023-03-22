package com.basic.Arrays;

import java.util.Arrays;

public class ShiftZeroesInRight {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 0, 1, 0, 7, 9, 0 };

		int count = 0; // this count variable tells me the no. of non zeroes elements
		for (int i = 0; i < array.length; i++) {

			if (array[i] != 0) {
				array[count++] = array[i];

			}

		}

		while (count < array.length) {

			array[count++] = 0 ;
		}

		System.out.println("The array with Zeroes shifted towards the right are: " + Arrays.toString(array));

	}

}
