package com.basic.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayClockWise {

	public static void main(String[] args) {
		
		
		int[] array = {1,2,3,4,5,6};
		Scanner sc =new Scanner(System.in);
		int rotations = sc.nextInt();
		System.out.println("The original array is : "+ Arrays.toString(array));
	    rotate(array,rotations);
	    
        	
		
	}
	
	
	
	public static void rotate(int array[] ,int n)
	{
		
		while(n>0)
		{	
		int length = array.length;
	   
		
		int x =  array[0]; // this stores the value at last Index 
		
		for (int i=0;i<length-1; i++) {
			
			
//			array[i]=array[i+1];// 
			array[i]=array[i+1];//
		}
	   	array[length-1]= x;
	   	n--;
	}
		System.out.println("The Array after final rotation is : "  +Arrays.toString(array));
	}
}
