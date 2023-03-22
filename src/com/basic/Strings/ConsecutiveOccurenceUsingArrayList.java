package com.basic.Strings;

import java.util.ArrayList;
import java.util.List;

public class ConsecutiveOccurenceUsingArrayList {

	public static void main(String[] args) {
	
		String string = "AADBBBCC";
		System.out.println(getConsecutiveOccurence(string.toLowerCase()));// Using CharAt()
		System.out.println(getConsecutiveOccurence(string.toLowerCase().toCharArray()));
		
		
		

	}

	private static List<String> getConsecutiveOccurence(char[] charArray) {

		List<String>  charCounts= new ArrayList<String>();
		char current=charArray[0];
		int count=1;
		for(int i=1;i<charArray.length;i++) {
			
			char c= charArray[i];
			if (current == c ) {
				
				count++;
			
			}
			else {
				
				charCounts.add(current + ":" + count);
				count =1;
				current=c;
			}
		}
		
		
		
		
		charCounts.add(current + ":" + count);
		return charCounts;
		
		
		
	}

	private static List<String> getConsecutiveOccurence(String string) {
		
		List<String>  charCounts= new ArrayList<String>();
		
		char current= string.charAt(0);
		int count =1;
		for (int i = 1; i < string.length(); i++) {
			
			char c = string.charAt(i);
			if (current==c) {
				
				count++;
			}
			else {
				
				charCounts.add(current+":" + count);
				count=1;
				current=c;
			}
			
			
		}
		
		
	charCounts.add(current+":" + count); // this handles last group frequency 
	return charCounts;	
	}
	

}
