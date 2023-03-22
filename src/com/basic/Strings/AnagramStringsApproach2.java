package com.basic.Strings;

import java.util.Arrays;

public class AnagramStringsApproach2 {

	public static void main(String[] args) {

		String input1 = "won";
		String input2 = "nowe";

		Boolean status = areAnagram(input1.toCharArray(), input2.toCharArray());
		System.out.println("The given strings are boolean  : " + status);

	}

	private static boolean areAnagram(char[] input1, char[] input2) {

		if (input1.length != input2.length)
			return false;
		else {

			Arrays.sort(input1);
			Arrays.sort(input2);
			for (int i = 0; i < input2.length; i++) {
				if (input1[i] != input2[i]) {
					return false;
				}

			}
			return true;
		}

	}
}
