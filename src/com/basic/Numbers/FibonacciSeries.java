package com.basic.Numbers;

import java.util.Scanner;

public class FibonacciSeries {

	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int end_point = scn.nextInt();
		int a=0;
		int b=1;
		for (int i =1 ;i <=end_point; i++) {
			 System.out.print(a+" ");
			 int  c= a+b;
			 a=b;
			 b=c;
		}
		
		
		
		
		
	}
}
