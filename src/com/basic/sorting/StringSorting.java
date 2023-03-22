package com.basic.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class StringSorting {
	
	
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String input = scn.next();
		System.out.println(sortString(input));
		
	}

	private static String  sortString(String input) {
		
		char[] letters = input.toCharArray();
		Arrays.sort(letters);
		return new String(letters);
		
	}

}
