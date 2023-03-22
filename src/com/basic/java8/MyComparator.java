package com.basic.java8;

import java.util.Comparator;

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o1-o2; // Here, o1 comes before , so Ascending Order
	}
	
}