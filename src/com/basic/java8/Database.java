package com.basic.java8;

import java.awt.List;
import java.util.ArrayList;

public class Database {

	
   public static java.util.List<EmployeeTaxEligibility> getEmployees() {
	   
	   
	   ArrayList<EmployeeTaxEligibility> list = new ArrayList<EmployeeTaxEligibility>();
	   EmployeeTaxEligibility emp1 = new EmployeeTaxEligibility("Shrey", 29, "IT", 50000);
	   EmployeeTaxEligibility emp2 = new EmployeeTaxEligibility("Shreya", 25, "IT", 25000);
	   EmployeeTaxEligibility emp3 = new EmployeeTaxEligibility("Rohit", 25, "HR", 60000);
	   list.add(emp1);
	   list.add(emp2);
	   list.add(emp3);
	   return list;
   }
	
   
   
   

	
}
