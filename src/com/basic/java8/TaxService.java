package com.basic.java8;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {


	private static List<EmployeeTaxEligibility> evaluateTaxUsers(String input ) {
		
		return (input.equals("Non-Tax"))
			 ? Database.getEmployees().stream().filter(p->p.getSalary()>=50000).collect(Collectors.toList())
			 : Database.getEmployees().stream().filter(p->p.getSalary()<50000).collect(Collectors.toList());
		
	}	
	
	
	public static void main(String[] args) {
		
		System.out.println(evaluateTaxUsers("Tax"));
		
		
		
		

	}


}
