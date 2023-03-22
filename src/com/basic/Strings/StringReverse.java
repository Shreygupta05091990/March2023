package com.basic.Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StringReverse {
	
	
	public static void main(String[] args) {
		
		
	String input="ALive is Handsome";
	
	String input1 = input.concat(""); // concat method returns new String object on every invocation .
	StringBuilder input2 = new StringBuilder("I love my India");
	System.out.println(input2.append("jfdkjfkdjkfd"));
	if(input1.hashCode()!=input.hashCode()) {
		
		System.out.println("These are 2 different Strings");
	}
	System.out.println("The reversed string using String Builder's reverse methods is---> " + reversedString(input));
    System.out.println("The string reverse without any inbuilt  method --->" + withoutInbuilt(input));
	
		
		
	   }

	private static String withoutInbuilt(String input) {
		
	 String  reversed= "";	
     for(int  i=input.length() -1; i>=0 ; i--) {
    	 reversed +=input.charAt(i);
    	 
     }
		
		
		
		return reversed;
	}

	private static StringBuffer reversedString(String input) {
		
		return new StringBuffer(input).reverse();
		
		
	}
	
	
	
	
	
	
	}
	
	


