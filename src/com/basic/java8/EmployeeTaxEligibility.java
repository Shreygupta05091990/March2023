package com.basic.java8;

public class EmployeeTaxEligibility {
	
	
	private String name;
	private int age ;
	private String department;
	private int salary;
	
	
	
	public EmployeeTaxEligibility(String name, int age, String department, int salary) {
		
		this.name = name;
		this.age = age;
		this.department = department;
		this.salary = salary;
		
		
		
		
	}



	public String getName() {
		return name;
	}






	public int getAge() {
		return age;
	}






	@Override
	public String toString() {
		return "EmployeeTaxEligibility [name=" + name + ", age=" + age + ", department=" + department + ", salary="
				+ salary + "]";
	}



	public String getDepartment() {
		return department;
	}




	public int getSalary() {
		return salary;
	}


	
	
	
	
	
	
	
	

}
