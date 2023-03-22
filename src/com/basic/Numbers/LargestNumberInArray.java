package com.basic.Numbers;

import java.util.Arrays;
import java.util.OptionalInt;

public class LargestNumberInArray {
	
	public static void main(String[] args) {
		
		
		
	    int[] integers = new int[] { 20, 98, 12, 7, 35 };
	    int length =  (int) Arrays.stream(integers).count();
	    // Find the size/length  of array using Java 8 Stream .
	    System.out.println(length);
	    
	    
	    int  maximum = (int)Arrays.stream(integers).max().getAsInt();
	    System.out.println( "The maximum number present in Array is " + maximum);
	    
	    
	    int  minimum = (int)Arrays.stream(integers).min().getAsInt();
	    System.out.println("The minimum number present in Array is " + minimum);
	    
	}
		

}
