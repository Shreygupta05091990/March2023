package com.basic.exceptions;

public class ExampleException {
	
	
	public static void main(String[] args) throws CustomCheckedException {
		int a =6;
		if(a!=2) {
			
			throw new CustomCheckedException("a is equal to 2");
		}
		
	}

}
