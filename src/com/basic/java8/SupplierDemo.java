package com.basic.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

	/*
	 * @Override public String get() {
	 * 
	 * return "Hi Shrey"; }
	 */
	
	public static void main(String[] args) {
	
		Supplier<String> supplier = ()->"2";
		System.out.println(supplier.get());
			
		
		
		String[] lordNames  = new String[]{};
		
		List<String>  list =   Arrays.asList(lordNames);
		
		System.out.println(list.stream().findAny().orElseGet(supplier));
		
	}

}
