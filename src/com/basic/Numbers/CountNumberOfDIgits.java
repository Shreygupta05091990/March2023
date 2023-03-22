package com.basic.Numbers;

import java.util.Scanner;

public class CountNumberOfDIgits {

public static void main(String[] args) {
	

	Scanner scn = new Scanner(System.in) ;
    int number = scn.nextInt()	;
    int dig=0;
	while (number!=0)
	{
		number=number/10;
		dig++;
		
	}
	
	System.out.println(dig);
}}
	
	
	
