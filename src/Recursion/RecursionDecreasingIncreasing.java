package Recursion;

import java.util.Scanner;

public class RecursionDecreasingIncreasing {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		printDecreasing(num);
		printIncreasing(num);	

	}

	public static void printIncreasing(int num ) {
		
		if (num == 0 ) {
			return;
		}
		printIncreasing(num - 1 );
		System.out.println(num);
	}
	public static void printDecreasing(int num ) {
		if (num==0) {
			return;
		}
		System.out.println(num);
		printDecreasing(num-1);
		
	}
	
}
