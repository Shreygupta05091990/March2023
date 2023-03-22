package com.basic.Numbers;

import java.util.Scanner;

public class PrintDigitsLeftToRight {
	
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int number= scn.nextInt();
		int temp=number;
		System.out.println("The Number is : " +temp);
		
		int digits=0;
		while(temp!=0) {
			
			temp=temp/10;
			
			digits++;
			
		}
			
		System.out.println("The length is " + digits);
		int    divisor= (int)Math.pow(10, digits-1);
//		System.out.println(divisor);
		int q;
		while(divisor!=0) {
			//System.out.println("Thw actual number is :" + number);
			q= number/divisor;
			
			System.out.println(q);
			number = number%divisor;
			divisor= divisor/10;
			
		}
		
		
		
		
		
		
		
	}

}
