package com.basic.Numbers;

import java.util.Scanner;

public class Factorial1 {
	
	
public static void main(String[] args) {
	
	Scanner scn = new Scanner(System.in);
	int number = scn.nextInt();
   long factorial = factorial(number);
   System.out.println("Fatorial of " +number +" is  " + factorial);
	
	
}

private static long factorial(int number) {
	if (number==0 || number==1) // check for the base condition 
		return 1;
	
      return  number*factorial(number-1);
      // factorial(number-1) ---> Faith  is that , this function works
      // now , with the help of  factorial(number-1) ---> we work on this factorial(number)
      
}
}
