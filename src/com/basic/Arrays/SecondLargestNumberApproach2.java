package com.basic.Arrays;

import java.util.Arrays;

public class SecondLargestNumberApproach2 {

	public static void main(String[] arguments) {
		
		int[] a= { 1, 2, 5, 6, 3, 2 };
		
		int secondLargest = SecondLargest(a);
		System.out.println(secondLargest);
		

	}

	private static int SecondLargest(int[] a) {
		int length = a.length;
		Arrays.sort(a);
		return a[length-5];
			
		}
		
	}


