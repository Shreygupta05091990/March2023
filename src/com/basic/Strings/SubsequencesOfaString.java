package com.basic.Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class SubsequencesOfaString {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(getSubSequence(str));

	}

	private static ArrayList<String> getSubSequence(String str) {

		if (str.length() == 0) {

			ArrayList<String> bres = new ArrayList<String>();
			bres.add("");

			return bres;

		}
		char first_char = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rres = getSubSequence(ros);
		ArrayList<String> mres = new ArrayList<String>();
		for (String rstr : rres) {
			mres.add("" + rstr);
			mres.add(first_char + rstr);

		}

		return mres;
	}
}