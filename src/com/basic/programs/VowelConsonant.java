package com.basic.programs;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		
		char[] JavaCharArray = {'a', 'e', 'i', 'o', 'u'};
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the character to be entered");
        char input = reader.next().charAt(0);
        
        for(int i =0 ; i<JavaCharArray.length; i++) {
        	
        	if(input==JavaCharArray[i]) {
        		
        		System.out.println("Input character is a vowel");
        		break;
        	}
        	else {
        		System.out.println("Input character is  not a vowel");
        		break;
        	}
        	
        }
        
        
        
	}

}
