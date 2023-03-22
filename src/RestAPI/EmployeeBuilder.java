package RestAPI;


// This is the external Builder class 
public class EmployeeBuilder {
	
	private String name;
	private String address;
	private int  id ;
	
	
	
	public EmployeeBuilder setName(String name) {
		this.name = name;
		return this;
	}
	
	public EmployeeBuilder setAddress(String address) {
		this.address = address;
		return this;
	}

	public EmployeeBuilder setId(int id) {
		this.id = id;
		return this;
	}
	
	
	public Employee build() {
		
		return new Employee(name , address , id );
		
	}

}
