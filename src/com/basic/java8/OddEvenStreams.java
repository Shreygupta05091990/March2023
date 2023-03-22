package com.basic.java8;

import java.util.Arrays;
import java.util.List;

public class OddEvenStreams {

	public static void main(String[] args) {
		
		
		Integer[] integers = new Integer[]{1,2,3,4,5,6,7};
		 List<Integer>   list = Arrays.asList(integers);		
		list.stream().filter(i->i%2==0).forEach(i->System.out.println(i+ " is even"));
		list.stream().filter(i->i%5==0).forEach(i->System.out.println(i+ " is multiple of 5 "));
		list.stream().filter(i->i%2==1).forEach(i->System.out.println(i+ " is odd "));
	}

}
