package com.basic.Numbers;

import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		
	System.out.println("Enter the number ??");
	Scanner sc =  new Scanner(System.in);  // inform scanner that the file source is system inputstream
	int  number = sc.nextInt();
		
	  if ( armstrong(number) ==number) {
		  
		  System.out.println("The number is palindrome");
	  }
	  else
		  System.out.println("The number is  not palindrome");
		
		
	}

	private static int armstrong(int number) {
		
		int total= 0;
		int remainder = 0;
		while(number>0) {
        remainder = number%10;
        total=total+remainder*remainder*remainder;
        number = number/10;
			
			
		}
		return total;
	}
	
	

}
