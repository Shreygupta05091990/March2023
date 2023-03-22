package com.basic.Patterns;
public class SpacedStarPyramid{
	
public static  void  pyramid(int n ) {
		
int i ,j,k;
for (i=1;i<=n;i++) 
  {
     for(j=n-1;j>=i;j--) 
     {
     System.out.print(" ");  	 
     }
     
     for(k=1;k<=i;k++) 
     {
     System.out.print("* ");  	 
     }
	 System.out.println();		
			
  }
}
	
	
	
	public static void main(String[] args) {
	
		int n=6;
		
		pyramid(n);
		
		
		}
	
	}