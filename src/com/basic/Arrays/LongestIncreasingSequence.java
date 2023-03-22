package com.basic.Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class LongestIncreasingSequence {

	public static void main(String[] args) {
		
	Scanner scn = new Scanner(System.in); //Tells what is the source of the input source 
		int n1 = scn.nextInt() ; // how many elements 
		int[] arr = new int[n1]; // declare an array  of siz eof the no.of elements
		
		for(int i=0; i<arr.length; i++)
		{
			
			arr[i]=scn.nextInt();
		}
	
		HashMap<Integer , Boolean>  map = new HashMap<Integer, Boolean>();
		for(int val  : arr) {
			
			map.put(val,true);
		}
		
        for(int val  : arr) {
			
			if (map.containsKey(val-1)){
				
			map.put(val,false);
				
			}
		}
		
        int ml=0;
        int msp=0;
        for (int val:arr) {
        	
        	if (map.get(val) == true) {
        		
        		int tl=1;
        		int tsp=val;
        		while(map.containsKey(tsp+tl)) {
        			
        			tl++;
        		}
        		if(tl>ml) {
        			ml=tl;
        			msp=tsp;
        			
        			
        			
        		}
        		
        	}
        	
        }
		
        for (int i=0;i<ml;i++) {
        	System.out.println(msp+i );
        	
        }
	}

}
