package comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Problem Statement: Sort on the basis of name , Age , Employee ID

public class Employee implements Comparable<Employee>{
	
	public String name;
	public String cName;
	public int age;
	public int eid;
	
	public Employee(String name, String cName,int age, int eid) {
		
		this.name = name;
		this.age = age;
		this.eid = eid;
		this.cName = cName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((cName == null) ? 0 : cName.hashCode());
		result = prime * result + eid;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (cName == null) {
			if (other.cName != null)
				return false;
		} else if (!cName.equals(other.cName))
			return false;
		if (eid != other.eid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", cName=" + cName + ", age=" + age + ", eid=" + eid + "]";
	}
	public String getName() {
		return name;
	}
	public String getcName() {
		return cName;
	}
	public int getAge() {
		return age;
	}
	public int getEid() {
		return eid;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	@Override
	public int compareTo(Employee o) { // Sorts by Employee ID
		if (eid == o.eid) {
			return 0;
		}else if (eid <o.eid) {
			return 1;
		}
		else 
			{return -1;
			}
		
	}
	
	public static void main(String[] args) {
		
		  
		  List<Employee> empList= new ArrayList<>();
		  Employee emp1 = new Employee("Saurabh", "Amazon",28,901);
		  Employee emp2 = new Employee("Shrey", "TCS",32,902);
		  Employee emp3 = new Employee("Shashank", "Adobe",28,903);
		  Employee emp4 = new Employee("Anubhuti", "MOB",28,904);
		  Employee emp5 = new Employee("Nikitha", "DailyHunt",28,905);
		  Employee emp6 = new Employee("Amuthan", "ClipBoard", 28, 906);
		  
		  
		  empList.add(emp1);
		  empList.add(emp2);
		  empList.add(emp3);
		  empList.add(emp4);
		  empList.add(emp5);
		  empList.add(emp6);
		  
		  Collections.sort(empList);
		  
		  
		  
		  System.out.println ("The Lsit of employees in default ascending order is " );
		  System.out.println(empList);
		  
		  Collections.sort(empList, new SortEmployeeByName());
		  System.out.println("************************************************************");
		  
		  System.out.println("The Lsit of employees  sorted by Name is  ");
		  System.out.println(empList);
		  
		  System.out.println("************************************************************");
		  
		  Collections.sort(empList,new SortEmployeeByEmpID());
		  System.out.println("The Lsit of employees  sorted by Emp Id in descending order is  ");
		  System.out.println(empList);
		  
		  
		  
		  
		  
	  }
	
	
	
  
}
