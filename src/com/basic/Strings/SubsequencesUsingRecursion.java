package com.basic.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsequencesUsingRecursion {
	
	
	
	
	@Override
	public String toString() {
		return "SubsequencesUsingRecursion []";
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String input = scn.nextLine();
		List<String> result = subsequences(input);
		System.out.println(result);
		
		
		
		
		
	}

	private static List<String> subsequences(String input) {
		if (input.length()==0) {    //Checking base condition 
			List<String>  bres = new ArrayList<String>();
			bres.add("");
		 return bres; 
		}
		
		char first_Char = input.charAt(0);
		String rest_of_string=  input.substring(1);
		
		List<String> main_result= new ArrayList<String>();
		List<String>  res = subsequences(rest_of_string);
		for (String c : res) {
			main_result.add(""+c);
			main_result.add(first_Char+c);
		}
		
		
		return main_result;
		
		
		
		
		
	}

}
