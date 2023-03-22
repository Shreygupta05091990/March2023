package com.basic.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDatabase {

	public static  List<CusotmerPojo>  getListOfCustomers(){
		
		
	return	Stream.of(new CusotmerPojo("Shrye", 12, "shreygupta33@gmail.com", Arrays.asList("9810983129","7905278430")),
				  new CusotmerPojo("Saksam", 23, "sakk@gmail.com",Arrays.asList("26656526","6587965656")))
	 .collect(Collectors.toList());
		
		
		
	}
	
	
	
	
	
}
