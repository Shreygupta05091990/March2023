package com.basic.java8;

interface Interface1{
	
	
	//Void Switch on 
//	void switchOn(int input );
	int  add(int a, int b);
	
	
}


public class FunctionalInterface {

	public static void main(String[] args) {
		
		
		Interface1  interface1= ( input1,input2)->input1*input2;
	
		System.out.println(interface1.add(10,5));
		
		// Advantage here is less no. of lines or reduces cod length .
		// if body has one line , no return statement is required
		// Cannot return void result .
		

	}

}
