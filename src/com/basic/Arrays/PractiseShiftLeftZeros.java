package com.basic.Arrays;

public class PractiseShiftLeftZeros {

	public static void main(String[] args) {
		
		
		int a[] = {1,2,3,0,5,0};
		int count= a.length-1;
		int j=0;
		for (int i = count; i >0 ;i--) {
			if (a[i]!=0) {
				a[count] = a[i];
				count--;
				
			}
		}
			while (j < count) {
				
				a[j]=0;
				j++;
			}
			
			 for (int i = 0; i < a.length; i++) {
					System.out.print(a[i]);
				}
		}

		
	}

