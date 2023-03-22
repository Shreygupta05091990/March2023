package com.basic.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.plaf.basic.BasicComboBoxUI.ComboBoxLayoutManager;

import CustomImmutableClass.Employee;

public class SortListUsingStream {

	
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList();
		list.add(10);
		list.add(1);
		list.add(12);
		list.add(25);
		

		// Below mentioned are the older approaches to sort a list 
		Collections.sort(list);// maintains ascending order
		Collections.reverse(list);  // reverses ascending order to descending order
		System.out.println( list);
		
		
		Collections.sort(list); //Default Natural Sorting Order 
		Collections.sort(list,new MyComparator());  // Applies Customised Sorting order  on list  i.e ascending  
		

		// Sorts in ascending order 
		list.stream().sorted().forEach(obj->System.out.println(obj));
		
		// sorts in descending order, Using Compartor.reverseOrder()
		list.stream().sorted(Comparator.reverseOrder()).forEach(obj->System.out.println(obj));
		
		ArrayList<EmployeeTaxEligibility> list_employee = new ArrayList<EmployeeTaxEligibility>();
		EmployeeTaxEligibility emp1 = new EmployeeTaxEligibility("Shrey", 29, "IT", 50000);
		EmployeeTaxEligibility emp2 = new EmployeeTaxEligibility("Shreya", 25, "IT", 25000);
		EmployeeTaxEligibility emp3 = new EmployeeTaxEligibility("Rohit", 23, "HR", 60000);
	
		list_employee.add(emp1);
		list_employee.add(emp2);
		list_employee.add(emp3);
		
		/***************************************************************************************************/
		 System.out.println("Sorting  with Comparator Object ");
		Collections.sort(list_employee,new MyEmployeeComparator()); // Sorting with passing Comparator Object 
		System.out.println(list_employee);
		
		
		/***************************************************************************************************/
		 System.out.println("Sorting  with Anonymous Inner Class");
		Collections.sort(list_employee, new MyEmployeeComparator() {
			
			@Override
			public int compare(EmployeeTaxEligibility o1, EmployeeTaxEligibility o2) {
				
				return o2.getSalary()-o1.getSalary();  // o2 comes before , so Descending order
			}
			
		});
		System.out.println(list_employee);
		
		/***************************************************************************************************/
		System.out.println("Sorting with Lambda Expressions in place of Anonymous Inner Class");
		
		Collections.sort(list_employee,(o1,o2)->o1.getSalary()-o2.getSalary() );
		System.out.println(list_employee);
		
		/***************************************************************************************************/
		System.out.println("Sorting with Stream API ");
		list_employee.stream().sorted((obj1,obj2)->obj1.getSalary()-obj2.getSalary() ).forEach(System.out::println);
		System.out.println(list_employee);
		
		
		/***************************************************************************************************/
		System.out.println("Sorting with Stream API    Comparator.comparing()  ");
		list_employee.stream().sorted(Comparator.comparing(obj->obj.getSalary())).forEach(System.out::println);
		System.out.println(list_employee);
		
		/***************************************************************************************************/
		System.out.println("Sorting with Stream API    Comparator.comparing(Key) ");
		list_employee.stream().sorted(Comparator.comparing(EmployeeTaxEligibility::getName)).forEach(System.out::println);
		System.out.println(list_employee);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}



	
	
}



