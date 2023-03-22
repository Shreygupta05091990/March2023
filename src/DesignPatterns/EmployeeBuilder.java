  package DesignPatterns;

public class EmployeeBuilder {
	
	
	
	private String name;
	private String address;
	private String id;
	private boolean isContractor;
	
	
	public EmployeeBuilder setName(String name) {
		this.name = name;
		return this; 
	}
	
	public EmployeeBuilder setAddress(String address) {
		this.address = address;
		return this; 
	}
	
	public EmployeeBuilder setId(String id) {
		this.id = id;
		return this; 
	}
	
	public EmployeeBuilder setContractor(boolean isContractor) {
		this.isContractor = isContractor;
		return this; 
	}
	
	public Employee build() {
		return new Employee(name, address, id, isContractor);
		
		
	}
	
	public static void main(String[] args) {
		
		Employee employee = new EmployeeBuilder()
		  .setAddress("228,Santosh Nagar  Colony ")
		  .setName("Shrey")
		  .setId("23")
		  .setContractor(true)
		  .build();
		}	
    }

 



