package com.basic.Strings;

import java.util.Scanner;

public class PermutationsOfAStringRecursion {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String  ques = scn.next();
        printPermutations(ques , "");
        
		
		
		

	}
 //   asf- answer so far 
	
	private static void printPermutations(String ques, String asf) {
	
		if( ques.length()==0) {
			System.out.println(asf);
			
		}
		
		
		for(int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String lpart=ques.substring(0, i);
			String rpart =ques.substring(i+1);
			String roq= lpart+rpart;
			printPermutations(roq, asf+ch);
		}
		
		
		
	}

}
