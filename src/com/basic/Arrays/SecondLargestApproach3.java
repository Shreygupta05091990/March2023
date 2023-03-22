package com.basic.Arrays;

public class SecondLargestApproach3 {

	
	public static void main(String[] args) {
	
		int a[] = {10,20,45 ,23 ,100};
		System.out.println(secondLargest(a)) ;
		
		
	}

	private static int  secondLargest(int[] a) {
      
		
		int max = a[0];
        int second_max =a[0];				
        int temp ;				
				for (int i = 1; i < a.length; i++) {
					
					if ( a[i] > second_max) {
						
						second_max= a[i];
					}
					if (second_max > max ) {
						temp =  max ;
					    max = second_max;
					    second_max= temp;
						
					}
				}
				
		return second_max;
	}


}
