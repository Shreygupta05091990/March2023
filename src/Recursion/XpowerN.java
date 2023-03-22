package Recursion;

import java.util.Scanner;

public class XpowerN {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Base ");
         int base = scn.nextInt();
         System.out.println("Enter Power ");
         int power =scn.nextInt();
         int  result = baseToPower(base,power);     
         System.out.println(result);
	}

	private static int  baseToPower(int base, int power) {
		
		  if (power==0) {
			  
			  return 1 ;
		  }
		  int xnm1 = baseToPower(base,power-1);
		  int xn = base * xnm1;
		  return xn;  
		
		
	}
	
	

}
