package com.basic.Strings;

public class RotationalStrings {
	
	
	
	
	public static void main(String[] args) {
		
		
		String str1="AACD"; 
		String str2="ACDA";
	    System.out.println("The input Strings are " + str1  +" , "+ str2);
	    if(areRotations(str1,str2)) {
	    	
	    	System.out.println("The String2 is a rotation of String1 ");
	    	}
	    else {
	    	System.out.println("The String2 is not a rotation of String1");
	    }
	    
		
		
		
		
	}

	private static boolean areRotations(String str1, String str2) {
		// TODO Auto-generated method stub
		return (str1.length()==str2.length()) && ((str1+str1).indexOf(str2)!=-1);
	}

}
