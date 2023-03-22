package com.basic.Strings;

import java.util.Scanner;

public class WordsInString {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String input = scn.nextLine();
		System.out.println("The numberof words in sentence are :- " + countWordsInSentence(input));

	}

	private static int  countWordsInSentence(String input) {
		String[] splitted = input.trim().split(" ");
		System.out.println(splitted.length);
		return splitted.length;

	}

}
