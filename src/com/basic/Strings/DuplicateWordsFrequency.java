package com.basic.Strings;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateWordsFrequency {

	private static HashMap<String, Integer> duplicate_Word_count(String original_String) {

		HashMap<String, Integer> eachWordCountMap = new HashMap<String, Integer>();

		String individual_words_array[] = original_String.split(" ");

		for (String word : individual_words_array) {

			if (eachWordCountMap.containsKey(word)) {
				eachWordCountMap.put(word, eachWordCountMap.get(word) + 1);

			} else {
				eachWordCountMap.put(word, 1);
			}

		}

		return eachWordCountMap;
	}

	public static void main(String[] args) {
//
		Scanner in = new Scanner(System.in);
		String original_String = in.nextLine();
//		String original_String= " this this this this this is a  is";
		HashMap<String, Integer> word_freq_hashMap = duplicate_Word_count(original_String);
		System.out.println(word_freq_hashMap);

	}

}
