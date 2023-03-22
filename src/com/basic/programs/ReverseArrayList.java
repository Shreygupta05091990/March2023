package com.basic.programs;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {

	
	public static ArrayList<Integer> reversedArrayList(ArrayList<Integer> arrayli) {
		
		
		
		ArrayList<Integer> reversedList = new ArrayList<Integer>();
		
		for(int i=arrayli.size()-1 ; i<=0;i++)
		{
			
			
			reversedList.add(arrayli.get(i));
		}
		
		
		System.out.println(reversedList);
		return reversedList;
		
		
		
		
		
	}
	
	
	
	@Override
	public String toString() {
		return "ReverseArrayList [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}



	public static void main(String[] args) {
		
		
		ArrayList<Integer> arrayli = new ArrayList<Integer>();
		  
        // Appending elements at the end of the list
        arrayli.add(new Integer(9));
        arrayli.add(new Integer(145));
        arrayli.add(new Integer(878));
        arrayli.add(new Integer(343));
        arrayli.add(new Integer(5));
        
        System.out.println("The original ArrayList is "+ arrayli);
		
        ArrayList<Integer> reversedArList = reversedArrayList(arrayli);
//        printReversedList(reversedArList);        
        System.out.println("The reversed ArrayList is " +  reversedArList);
        
        
        

	}



	private static void   printReversedList(List reversedArList) {
		
		
		for (int i =0; i<reversedArList.size();i++) {
			System.out.print(reversedArList.get(i)+" ");
			
		}
		
		
	}

}
