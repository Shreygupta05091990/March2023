package com.basic.Numbers;

import java.util.Scanner;

public class RotationApproach2 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
	    System.out.println("Input the number?");
		int number =scn.nextInt();
		System.out.println("Enter no.  of times the rotation ?");
		
		int rotations=scn.nextInt();
		
		
		
//		
		int digits = calculateDigits(number);
		
		rotate(number, digits, rotations);
		
		
}
	
private static void rotate(int number, int digits, int rotations) {
	
  if (rotations>digits) {
	rotations=rotations%digits;  
  }
	int rot_pow =   (int) Math.pow(10, rotations);
	    int q= number/rot_pow;
	int front= number%rot_pow; 
	  int rotated= (front*(int)Math.pow(10, digits-rotations))+q;
	  System.out.println(rotated);
	
		
	}

public static int 	calculateDigits(int temp) {
	
	System.out.print("The rotations are : ");
	int digits =0;
	while(temp!=0) {
		
		temp=temp/10;
		
		digits++;
		
	}
	return digits;
}

}