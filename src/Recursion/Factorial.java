package Recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

//		Within static blocks or methods , only final 
		Scanner sc =new Scanner(System.in);
		int num =sc.nextInt();
		

		int factorial = recursivefactorial(num);
		System.out.println("Factorial of " + num + " is " + factorial) ;

	}

	private static int recursivefactorial(int num) {

		if (num == 0) {  // This is the base case 
			return 1;
		}
		int fn = num * recursivefactorial(num-1);
        return fn;
	
/* the call stack gets formed 
 *   
 * recursiveFactorial(1)
 * recursiveFactorial(2)
 * recursiveFactorial(3)
 */
}
}