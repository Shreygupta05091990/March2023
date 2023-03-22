package com.basic.java8;

import java.util.Arrays;
import java.util.List;

public class MaxValueUsingStreams {
	
	
	public static void main(String[] args) {
		
		
		
		List<Integer> numbers = Arrays.asList(1,2,34,677,8);
		
		Integer sum = numbers.stream().reduce(0,(a,b)->a+b);
		System.out.println("The sum is " + sum);
		
		
		Integer  max = numbers.stream().reduce(0,(a,b)-> a>b?a:b);
		System.out.println("The max number is "+max);
		
		
		Integer  min = numbers.stream().reduce(0,(a,b)-> a<b?a:b);
		System.out.println("The min number is "+min); 
		
		
	}

}
