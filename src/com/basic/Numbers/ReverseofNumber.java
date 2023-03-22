package com.basic.Numbers;

public class ReverseofNumber {

	public static void main(String[] args) {
		
		int num= 1234;
		System.out.print("The reverse of a number is == ");
		while(num>0) {
			
			int ld=num%10;
			System.out.print(ld);
			num=num/10;
		}
		
		

	}

}
