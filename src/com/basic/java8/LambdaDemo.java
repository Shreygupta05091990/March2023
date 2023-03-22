package com.basic.java8;

public class LambdaDemo
{
	
	

	/*
	 * public interface Iadd {
	 * 
	 * int add(int a,int b);
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		
		Iadd kjk =new Iadd(){

			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
			
			
			
		};// lambda Expression
		
		Iadd hjfhjd =(a, b)->a+b;
		
		
		IBoolean bool =s->false;
	    bool.contains()
		
	
		
		
		
			
			
			
	
		
		
		
		
		System.out.println(kjk.add(4, 5));
		
		
	}

}
