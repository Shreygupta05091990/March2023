package com.basic.Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CommonElementsOf2Arrays {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in); //Tells what is the source of the input source 
		// Starts filling the data in the array for 1st Array
		int n1 = scn.nextInt() ; // how many elements 
		int[] a1 = new int[n1]; // declare an array  of siz eof the no.of elements
		
		for(int i=0; i<a1.length; i++)
		{
			
			a1[i]=scn.nextInt();
		}
		
	  // ENtering data for 2nd Array 
		int n2 = scn.nextInt() ; // how many elements 
		int[] a2 = new int[n2]; // declare an array  of siz eof the no.of elements
		
		for(int i=0; i<a2.length; i++)
		{
			
			a2[i]=scn.nextInt();
		}
       
		HashMap<Integer,Integer> map_Array1= new HashMap<Integer, Integer>();
		
		for (int i=0; i<a1.length;i++) {
			
			if(!map_Array1.containsKey(a1[i]))
			{
				map_Array1.put(a1[i], 1);
			}
			else {
				map_Array1.put(a1[i],map_Array1.get(a1[i]) +1);
				
			}
		}
		
		for (int i =0 ;i<a2.length ;i++) {
			
		 if (map_Array1.containsKey(a2[i])) {
			 
			 System.out.println(a2[i]);
			 map_Array1.remove(a2[i]);
		
		}
		
			
		}
		
			
		}	
		
		
		
		
		
		
		
		
		
		
		
		

	}


