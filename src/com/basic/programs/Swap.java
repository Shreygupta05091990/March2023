package com.basic.programs;

public class Swap {

	public static void main(String[] args) {
		
		int a= 5;
		int b=10;
		
		/*  Case 1 : With the use  of 3rd Variable 
		 * System.out.println("The nos. before swapping a="+a + "  b = " +b); int c=a;
		 * a=b; b=c; System.out.println("The nos. after swapping a="+a + " b = " +b);
		 */

		 // Case 2 : Without making the use  of 3rd Variable 
			
		
		System.out.println("The nos. before swapping a="+a + "  b = " +b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The nos. after swapping a="+a + " b = " +b); 
		
		
		
		
	}

}
