package com.basic.java8;

import java.util.Comparator;

public class MyEmployeeComparator   implements  Comparator<EmployeeTaxEligibility>{

	@Override
	public int compare(EmployeeTaxEligibility o1, EmployeeTaxEligibility o2) {
		
		return o2.getSalary()-o1.getSalary();  // o2 comes before , so Descending order
	}
	
	
	
	
	

}
