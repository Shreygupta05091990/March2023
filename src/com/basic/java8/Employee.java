package com.basic.java8;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
	int id ; 
	String Name;
	String Dept;
	int salary ;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, String dept, int salary) {
		super();
		this.id = id;
		Name = name;
		Dept = dept;
		this.salary = salary;
	}	
  @Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", Dept=" + Dept + ", salary=" + salary + "]";
	}
public static void main(String[] args) {
	
	  Scanner scn = new Scanner(System.in);
	  int n = scn.nextInt();
	  
	 List<Employee>  employees  =  Stream.of(new Employee(1,"Basant", "QA", 6000),
			  								 new Employee(2,"Saksham", "DEV", 7000),
			  								 new Employee(3,"Shrey", "QA", 7001),
			  								 new Employee(4,"Shreyansh", "QA", 4500),
			  								 new Employee(5,"Naveen", "QA", 10000),
			  								 new Employee(6,"Samiksha", "DEVOPS", 9000))
			 			             .collect(Collectors.toList());
	 // Group employees by Department 
	 Map<String, List<Employee>>  employeeMap = employees.stream().collect(Collectors.groupingBy(Employee::getDept));
	 System.out.println(employeeMap); 
	 
	 
	 
	 
   // Aggregate functions    within  a department/group : 
	IntSummaryStatistics statistics =  employees.stream().filter(o->o.getDept().equals("QA")).collect(Collectors.summarizingInt(o->o.getSalary()));
	System.out.println("Total salary given to QA department is :- " +  statistics.getSum());
	System.out.println("The minimnum salary given to QA department is :- " +  statistics.getMin());
	System.out.println("The average salary to QA department is :- " +  statistics.getMax());
	System.out.println("The number of members present in the group are :- " +statistics.getCount());
	
	// Extract the names  of a members in a group 
	Set<String>   employee_names = employees.stream().filter(o->o.getDept().equals("QA")).map(o->o.getName()).collect(Collectors.toSet());
	System.out.println("Set of Employee Names from QA Department :" + employee_names);
	
	
	// Extract the name from a group which meets a condition 
	int max_salary = employees.stream().filter(o->o.getDept().equals("DEV")).map(e->e.getSalary()).max(Integer::compare).get();
	List<String> highest_salary  =employees.stream().filter(e->e.getSalary()==max_salary).map(Employee::getName).collect(Collectors.toList());
	System.out.println(highest_salary);
	
	// How to get Maximum salary from Each of the Departments ?
	 
	Map<String,Optional<Employee>> map = employees.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
	
	
	
	// How to find the 3rd maximum salary ?
    Optional<Employee>  highest= employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).findFirst();
	
	System.out.println(highest);
	

	
	
	 
	 
   	 
	 
	 
	 
}
}
