package comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student2 {

	private String name;
	private int age;
	private int rollNo;
	
	public Student2(String name, int age, int rollNo) {
		
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
	}

	
	public int getAge() {
		return age;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public String  getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollNo;
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
		Student2 other = (Student2) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNo != other.rollNo)
			return false;
		return true;
	}


	public static void main(String[] args) {
		
		Student2 s1 = new Student2("Shrey", 5,5);
		Student2 s2= new Student2("Adrit", 2 ,7);
		Student2 s3 = new Student2("Doll", 1,9);
		
		
	
		List<Student2>  list= new ArrayList<Student2>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
       
		System.out.println("Original ArrayList " + list); 
		
		//Age Sorting
		AgeComparator ageComparator = new AgeComparator();
	    Collections.sort(list,ageComparator );
		System.out.println("List according to age sorting " + list);
		
		// RollNo Sorting
		RollNoComparator rollNoComparator = new RollNoComparator();
		Collections.sort(list,rollNoComparator );
		System.out.println("List according to Roll No  sorting -->" + list);
		
		
		
		//Name Sorting 
		NameComparator nameComparator =new NameComparator() ;
		Collections.sort(list,nameComparator);
		System.out.println("List according to Name  sorting " + list);		
	}
	
	
	
	


	
	
	
	
	
	
	
	
	
}
