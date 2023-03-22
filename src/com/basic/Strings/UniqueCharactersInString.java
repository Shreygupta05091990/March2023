package com.basic.Strings;

import java.util.LinkedHashSet;

public class UniqueCharactersInString {

	public static void main(String[] args) {

		String companyName = "INFOSYS";
		

		System.out.println(uniqueCharactersFromString(companyName.toCharArray()));

	}

	private static LinkedHashSet<Character> uniqueCharactersFromString(char[] ch) {

		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < ch.length; i++)
			set.add(ch[i]);

		return set;

	}

}
