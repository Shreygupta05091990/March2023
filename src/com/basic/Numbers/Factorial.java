package com.basic.Numbers;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		 int input = scn.nextInt();
		 int fact1=1;
		 int factorial = factorial(input,fact1);
		 System.out.println(factorial);
		 
	}

	private static int factorial(int input, int fact1) {
		
		while(input>0)
		{ 
			
			fact1=input*factorial(input-1,fact1);
		}
		return fact1;
	}
}

