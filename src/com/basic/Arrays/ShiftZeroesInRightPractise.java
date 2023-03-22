package com.basic.Arrays;

public class ShiftZeroesInRightPractise {

	public static void main(String[] args) {
        int a[]  = { 1,0,4,5,0,2,0,5,0}; //9 elements 
        
		int nz=0;
		int zeroes =0;
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]>0) {
				a[nz] = a[i];
			    nz++;
			}
		}
        while(nz<a.length) {
        	
        	a[nz]=0;
        	nz++;
        }
		
        
       for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]);
	}
        
        
        

	}

}
