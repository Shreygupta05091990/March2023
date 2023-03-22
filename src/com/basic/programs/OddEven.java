package com.basic.programs;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter the no?");
		int num= reader.nextInt();
		if(num%2==0) {
			System.out.println("The entered no is even");
			
		}
		else {
			
			System.out.println("The entered no is odd");
		}
		

	}

}
