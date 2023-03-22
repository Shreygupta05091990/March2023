package com.mainmethod;

public class mainmethodOverloading {

	public static void main(String[] args) {
		
		System.out.println("In String[] main method");
		int[] a = {2,3,4};
		main(a);
		main(6.7f);

	}

	
	public static void main(int[] args) {

		System.out.println("In int[] main method");
		
}
	
	public static void main(float f) {
		
		System.out.println("In float  main method");
		
	}
}