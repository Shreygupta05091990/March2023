package com.basic.Strings;

public class OccurencesOfAWordInString {

    public static void main(String[] args) {
		
    	
    	String input="breadbreadJambreadjambread";
    	String text="bread";
    	int count= 0;
    	for(int i=0;i<input.length();i++) {
    		
    		for(int j=0;j<input.length();j++) {
    			
    			if( j>i && input.substring(i,j+1).equals(text)) {
    				
    				count++;
    			}
    		}
    	}
    	System.out.println("The word count is :- " + count);
    	
    	
	}
	
	
}
