package com.basic.java8;

import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMap {
	
	
	
	public static void main(String[] args) {
		
		
		List<CusotmerPojo>  customer  =  EkartDatabase.getListOfCustomers();
		System.out.println("Cusotmers " + customer);
		
	   // List<Customer>   converts to   List<String> --- data Transformation    
		// mapping Logic-customer ->customer.getEmail()  meaning  one to one mapping, for one customer,one email.is there. 
		
		List<String> list_Email=  
				customer.stream()
				.map(obj->obj.geteMail())
				.collect(Collectors.toList());
		
		
		System.out.println(list_Email);
		
		
		// mapping Logic-customer ->customer.getPhoneNumbers()  meaning  one to many mapping, for one customer,multilpe phone nos.
		List<List<String>> list_Phones= 
				customer.stream()
				.map(obj->obj.getPhoneNumbers())
				.collect(Collectors.toList());
		System.out.println(list_Phones);		
		
		
		
		// Map doesnt give data in flatttened structure , since there is nested List involved, we want flatMap
				List<String> list_Phones_Flat= 
						customer.stream()
						.flatMap(obj->obj.getPhoneNumbers().stream())
						.collect(Collectors.toList());
				System.out.println(list_Phones_Flat);		
				
		
		
		
		
	}
	
	
	
	

}
