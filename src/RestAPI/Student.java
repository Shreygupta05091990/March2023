package RestAPI;

public class Student {
	
	int roll_no;
	String  name;
	int age ;
	String address;
	String skill;
	long phoneNo;
	public Student(int roll_no, String name, int age, String address, String skill, long phoneNo) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.age = age;
		this.address = address;
		this.skill = skill;
		this.phoneNo = phoneNo;
	}

	public int getRoll_no() {
		return roll_no;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	public String getSkill() {
		return skill;
	}
	public long getPhoneNo() {
		return phoneNo;
	}

	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", age=" + age + ", address=" + address + ", skill="
				+ skill + ", phoneNo=" + phoneNo + "]";
	}
	
}

