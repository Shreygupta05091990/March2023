package CustomImmutableClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public  class Employee {
	
	// * In Java, all the wrapper classes (like Integer, Boolean, Byte, Short) and String class is immutable.
	// * The class must be declared as final so that child classes can’t be created. 
	// * Data members in the class must be declared private so that direct access is not allowed.
	// * Data members in the class must be declared as final so that we can’t change the value of it after object creation.
	// * There should be no setters or in simpler terms, there should be no option to change the value of the instance variable.
	private final String name;
	private final Date doj;
	private final List<String> mobile;
	private final  Address address;
	

	public Employee(String name, Date doj, List<String> mobile, Address address) {
		
		this.name = name;
		this.doj = doj;
		this.mobile = mobile;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		//return address; This allows to modify the values 
		return new Address(address.getCity(),address.getZip()); //The person who has set these values , can use this.
	}

	public Date getDoj() {
		return (Date) doj.clone();// this clone makes it immutable 
		// return doj;   This is not mutable
	}

	public List<String> getMobile() {
		//return mobile;  --> This allows to modify the values . 
		//return Collections.unmodifiableList(mobile);this solves the purpose but it throws unnecessary exception 
		return new ArrayList<String>(mobile);
	}
	
	
	public static void main(String[] args) {
		
		
	
		
		System.out.println("**********************************");
		
		
		Employee emp= new Employee("Shrey",new Date(),Arrays.stream(new String[] {"1234","43433"}).collect(Collectors.toList()),address); 
		emp.getDoj().setDate(15);
		emp.getMobile().add("3232");
		emp.getAddress().setCity("LKO");
		emp.getAddress().setZip("2626266");
		System.out.println("Updated Employee Object : " +emp);
		
		
		
		String name= new String("Shrey");  // 2 Objects--> 1 in Heap , 1 in SCP
		String name1="Shrey";
		
		if (name.intern().hashCode()==name1.hashCode()) 
			
			System.out.println("Referred from SCP");
		
			else System.out.println("Not referred from SCP");
		
		
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", doj=" + doj + ", mobile=" + mobile + ", address=" + address + "]";
	}

}
