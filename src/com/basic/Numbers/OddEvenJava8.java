package com.basic.Numbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenJava8 {

	public static void main(String[] args) {
		
		
		Integer[] numbers= new Integer[] {1,2,3,4};
		List<Integer> even_list = Arrays.asList(numbers).stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(even_list);
		
		
		
		
		

	}

}
