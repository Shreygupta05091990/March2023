package com.basic.Numbers;

import java.util.Scanner;

public class RotationsOfaNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();

		int digits = numberOfDigits(number);
		System.out.println("Number of Digits are : " + digits);
		rotations(number, digits);
		

	}

	private static void rotations(int number, int digits) {
	    
		for(int i=1;i<=digits-1; i++) {// this loop runs till the number of Digits 
		int pow_ten = (int) Math.pow(10, digits-1);// Casting to int is used as by default it returns in double .
		int first_digit =  number/pow_ten;
	    int rotated_number = (number*10 +first_digit )-(first_digit*pow_ten*10);
	    System.out.println("Rotated Number : " +rotated_number  );
	    number=rotated_number;
		}
	}
	
	private static int numberOfDigits(int number) {

		int digits = 0;
		while (number > 0) {

			number = number / 10;
			digits++;
		}

		return digits;

	}
	
	
	

}
