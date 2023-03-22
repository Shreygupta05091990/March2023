package com.basic.java8;

import java.util.function.Predicate;

public class PredicateDemo  {
	/*
	 * @Override public boolean test(Integer t) 
	 * { if (t%2==0) 
	 * 		return true; 
	 * else
	 * 		return false; }
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		Predicate<Integer> predicate =  t-> t%2==0;
		//Here in above line , it understands ,t-> t%2==0; -> is implementation  of test() which returns true/false.
		
		System.out.println(predicate.test(102));
		
		
	}
	
	

}
