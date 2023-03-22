package Recursion;

import java.util.Scanner;

public class FirstIndexInArray {

	public static void main(String[] args) {

		int[] arr = { 20, 2, 33, 78, 110, 2, 6, 8, 78 };
		Scanner scn = new Scanner(System.in);
		int d = scn.nextInt();
		int fi = firstIndex(arr, 0, d); // d->data
//		System.out.println("First Index of " + d + " is " + fi);
		int lastIndex = firstIndexOtherApproach(arr, 0, d);
		System.out.println("First Index of " + d + " is " + lastIndex);
	}

	private static int firstIndexOtherApproach(int[] arr, int idx, int d) {

		if (idx == arr.length) {
			return -1;
		}
		
		if (arr[idx] == d) {

			return idx;

		} else {
			int fiisa = firstIndexOtherApproach(arr, idx + 1, d); // fiisma --> first index in small array

			if (arr[idx] == d) {
				return idx;

			} else
				return fiisa;

		}

	}

	

	private static int firstIndex(int[] arr, int idx, int d) {

		if (idx == arr.length - 1) {
			return -1;
		}

		int fiisa = firstIndex(arr, idx + 1, d); // fiisma --> first index in small array

		if (arr[idx] == d) {
			return idx;

		} else
			return fiisa;

	}

}
