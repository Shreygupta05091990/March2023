package com.basic.Searching;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 5, 7, 8, 9 };
		Scanner scn = new Scanner(System.in);
		int data  = scn.nextInt();
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {

			int mid = (low + high) / 2;
			if (data > arr[mid]) {

				low = mid + 1;
			} else if (data < arr[mid]) {
				high = mid - 1;

			} else if(data == arr[mid]) {
				System.out.println("The number is found at : - " + mid);
			    break;
			   }
			
		}

		

	}

}
