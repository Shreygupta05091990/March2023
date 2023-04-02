package com.basic.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.sun.tools.javac.code.Attribute.Array;

public class Mergin2ArraysUsingStreams {
	
	
	public static void main(String[] args) {
		 // Union, Intersection and Comparison of 2 arrays
		
		Integer[] age_QA = { 12, 45, 7, 8, 9, 10 };
		Integer[] age_DEV = { 12, 45, 7, 8, 9 };
		
		
		System.out.println("************************Union of 2 Arrays***********************************"); 
	    
		Integer[] union = Stream.of(age_QA, age_DEV).flatMap(Stream::of).distinct().sorted().toArray(Integer[]::new );
		for (Integer number : union){
			System.out.print(number + " ");

		}
       
		System.out.println();
		
		System.out.println("************************Intersection of 2 Arrays***************************");
		Integer[] intersection = Arrays.stream(age_QA).distinct().sorted().filter(o->Arrays.asList(age_DEV).contains(o)).toArray(Integer[]::new);
		for (Integer number : intersection){
			System.out.print(number + " ");

		}
		System.out.println();

		System.out.println("Are the 2 arrays equal - " + compare2Arrays(age_QA, age_DEV));
		
}  public static boolean compare2Arrays(Integer a[] , Integer b[]) {
	
	
	if (a==b)
		return true;
	if (a.length!=b.length || a==null || b==null ) {
		return false;
		}
  return IntStream.range(0, a.length).allMatch(i->a[i].equals(b[i]));	
	
}

}
