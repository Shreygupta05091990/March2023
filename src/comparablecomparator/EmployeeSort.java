package comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSort  {

	public static void main(String[] args) {
		
		  
		  List<Employee> empList= new ArrayList<>();
		  Employee emp1 = new Employee("Saurabh", "Amazon",28,901);
		  Employee emp2 = new Employee("Shrey", "TCS",32,902);
		  Employee emp3 = new Employee("Shashank", "Adobe",28,903);
		  Employee emp4 = new Employee("Anubhuti", "MOB",28,904);
		  Employee emp5 = new Employee("Nikitha", "DailyHunt",28,905);
		  Employee emp6 = new Employee("Amuthan", "CLipBoard", 28, 906);
		  
		  
		  empList.add(emp1);
		  empList.add(emp2);
		  empList.add(emp3);
		  empList.add(emp4);
		  empList.add(emp5);
		  empList.add(emp6);
		  
		  
		  System.out.println ("The Lsit of employees in default order is " );
		  System.out.println(empList);
		  
		  Collections.sort(empList, new SortEmployeeByName());
		  System.out.println("************************************************************");
		  
		  System.out.println("The Lsit of employees  sorted by Name is  ");
		  System.out.println(empList);
		  
	  }
	
	
	
}
