package RestAPI;

public class Employee {
	
	
	private String name;
	private String address;
	private int  id ;
	
	
	
	
	private  Employee(String name, String address, int id) {
		
		this.name = name;
		this.address = address;
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getId() {
		return id;
	}
	
	
	public static  EmployeeBuilder  builder(){
		
		return new EmployeeBuilder();
	}
	
	
	public static class EmployeeBuilder{
		
	    private String name;
		private String address;
		private int  id ;
		
		
		public Employee  build() {
			
			return new Employee(name, address, id );
		}
		
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
		
		
		
	}
	
	

	
}
