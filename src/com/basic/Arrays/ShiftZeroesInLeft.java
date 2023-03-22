package com.basic.Arrays;

import java.util.Arrays;

/*  Q.  Shift the Zeroes to the Left  and the non Zeroes to the RIght 




*/
public class ShiftZeroesInLeft {

	public static void main(String[] args) {
	 
		int[]  array = {1,2,3,0,1,0,7,9,0};
		
		int count=array.length-1 ;
		for (int i=array.length-1 ;i >=0; i--) {
			
			if (array[i]!=0) {
				array[count--]=array[i];

				
				
			}
			
			
		}
		
		
		while (count>=0) {
			
			array[count--]=0;
		}
	
		System.out.println("The array with Zeroes shifted towards the left are: " + Arrays.toString(array) );

	}

}
