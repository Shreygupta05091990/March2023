package Recursion;

import java.util.Scanner;

public class LastIndexInArray {

	public static void main(String[] args) {

		int[] arr = { 20, 2, 33, 78, 110, 2, 6, 8, 78 };
		Scanner scn = new Scanner(System.in);
		int d = scn.nextInt();

		int lastIndex = lastIndex(arr, 0, d);
		System.out.println("Last Index of " + d + " is " + lastIndex);

	}

	private static int lastIndex(int[] arr, int idx, int d) {

		if (idx == arr.length ) {
			return -1;
		}
		int liisa = lastIndex(arr, idx + 1, d); // liisa --> last index in smaller array .
		if (liisa == -1) {
			if (arr[idx] == d) {
				return idx;
			} else {
				return -1;
				
			}

		}
		else {
			return liisa;
			
		}

	}
}
