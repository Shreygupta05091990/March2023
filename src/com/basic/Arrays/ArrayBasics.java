package com.basic.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayBasics {

	public static void main(String[] args) {
		
		
	   Integer  arr[] = {10,12,12,12};
	   System.out.print("The array is " + arr);
	   
	   Integer[] copiedArray=   Arrays.copyOf(arr, 8);
	   for (int i = 0; i < copiedArray.length; i++) {
		System.out.println(copiedArray[i]+" ");
	}
	   List<Integer> arrList = new ArrayList<Integer>(Arrays.asList(arr));
//	   for (int i = 0; i < arr.length; i++) {
//	    arrList.add(arr[i]);
//	}
	   System.out.println(arrList);
	   
	   
	   System.out.println("\nThe Arrays in list form is " + Arrays.asList(arr));
	   
	   Character charArray[]
	            = {'A','b','c','d'};
	   System.out.println("\n Array input: "
               + Arrays.asList(charArray));
	   
	   
	   String[] stringArray = {"Shrey" , "Shantanu"};
	   
	   System.out.println("\n String array is "  +  Arrays.asList(stringArray));
	  
	   String name= "Shrey";
	   name.toCharArray();
	   
	   System.out.println();
	   
	    
	   String countryArray[]
	            = { "India", "Pakistan", "Afganistan",
	                "Srilanka" };
	 
	        List<String> countryList
	            = new ArrayList<>(Arrays.asList(countryArray));
	        
	        countryList.add("UAE");
	 

	}
}
