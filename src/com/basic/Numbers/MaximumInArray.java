package com.basic.Numbers;

import java.util.Arrays;

public class MaximumInArray {

	public static void main(String[] args) {
		
		
		Integer[] a = {1,2,3,4,33,57};
		int min =Arrays.stream(a).min().getAsInt();
		System.out.println(Arrays.asList(a).stream().reduce(0,(a1,b)->a1>b ?b:a1));
		
		System.out.println(Arrays.asList(a).stream().min()
		
		

	}

}
