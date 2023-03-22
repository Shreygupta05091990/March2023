package com.basic.Arrays;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArray {
	
	public  List<Integer> removeDuplciatesUsingJava7(int array[]) {

		Set<Integer> set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < array.length; i++) {

			if (set.add(array[i]) == true) {

				list.add(array[i]);

			}

		}
       return list ;
		
	}
	

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 2, 5, 6, 7, 8, 9, 3 };
		RemoveDuplicatesFromArray dup = new RemoveDuplicatesFromArray();
		
		
		
		List<Integer> list = dup.removeDuplciatesUsingJava7(array);
		System.out.println("The list of duplicate/repetitive elements from the array  is " + list );
		System.out.println("The maximimum in array is : " + Arrays.stream(array).max());
		
		List<Integer> list1  = removeDuplicateUsingJava8(array);
		System.out.println("the new List is --> " + list1);
		
	}


	private static List<Integer> removeDuplicateUsingJava8(int[] array) {

		List<Integer> lst = new ArrayList<>();
		lst.add(5);
		lst.add(5);
		lst.add(8);
		List<Integer> list = lst.stream().distinct().collect(Collectors.toList());
		return list;
		
	}
}