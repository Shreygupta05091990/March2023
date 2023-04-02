package com.basic.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.basic.java8.forEachDemo;

public class Sort {
	
	
	public static void main(String[] args) {
		
		
		char[] ch = {'b','c'};
		Arrays.sort(ch);
		for (char c : ch) {
			System.out.print(c + " ");
		}
		System.out.println();
		Integer[] array= {12,5,68,33,88};
		List<Integer> list1 = Arrays.asList(array); 	
		Collections.sort(list1, (o1,o2)->o2.compareTo(o1));
		
		for (Integer n : list1) {
			System.out.print(n+" ");
			
		}
	
	Character[] ch1 = {'b','d','a'};
	List<Character> list_char= Arrays.asList(ch1);
	Collections.sort(list_char, (o1,o2)->o1.compareTo(o2));
	
	List<Character> char_list = new ArrayList<Character>();
	for (Character character : list_char) {
		
		char_list.add(character);
	}
	System.out.println(char_list);
	}

}
