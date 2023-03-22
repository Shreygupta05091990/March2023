package com.basic.Strings;

import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicStrings {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str1 = scn.next();
		String str2 = scn.next();

		Boolean status = isIsomorphic(str1, str2);
		System.out.println(status);

	}

	private static Boolean isIsomorphic(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;

		}

		HashMap<Character, Character> characters_map = new HashMap<Character, Character>();
		HashMap<Character, Boolean> boolean_usage_map = new HashMap<Character, Boolean>();

		for (int i = 0; i < str1.length(); i++) {

			char str1_i = str1.charAt(i);
			char str2_i = str2.charAt(i);

			if (characters_map.containsKey(str1_i) == true) {
				if (characters_map.get(str1_i) != str2_i)
					return false;

			} else {
				if (!boolean_usage_map.containsKey(str2_i)) {

					boolean_usage_map.put(str2_i, true);
					characters_map.put(str1_i, str2_i);
				}

			}

		}

		return true;
	}

}
