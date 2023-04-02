package RestAPI;

public class StudentBuilder {
	
	
	
	int roll_no;
	String  name;
	int age ;
	String address;
	String skill;
	long phoneNo;
	
	public StudentBuilder setRoll_no(int roll_no) {
		this.roll_no = roll_no;
		return this;
	}
	public StudentBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public StudentBuilder setAge(int age) {
		this.age = age;
		return this;
	}
	public StudentBuilder setAddress(String address) {
		this.address = address;
		return this;
	}
	public StudentBuilder setSkill(String skill) {
		this.skill = skill;
		return this;
	}
	public StudentBuilder setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
		return this;
	}
	private Student build() {
		return new Student(roll_no, name, age, address, skill, phoneNo);}
	
	public static void main(String[] args) {
		
		
		Student student = new StudentBuilder().setRoll_no(1).setName("Shrey").setPhoneNo(123456789).setSkill("Java").setAge(33).build();
		System.out.println(student);
	}
	
		
	
		
		
		
	}
	
	
	
	


