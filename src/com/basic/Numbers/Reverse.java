package com.basic.Numbers;

import java.util.Scanner;

public class Reverse {

	
	
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number to be reversed??");
		int number = scn.nextInt();
		
		System.out.println("The reverse of the input number is -->   " +reverse(number));
		
		
		
	}

	private static int  reverse(int number) {
		int r=0,total=0;
		
		while(number>0) {
			r=number%10;
			total = total*10+ r;
			number = number/10;
			
			
		}
		
		
		return total ;
	}
}
