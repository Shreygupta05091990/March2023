package comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student1 implements Comparable<Student1> {

	private String name;
	private int age;

	public Student1(String name, int age) {

		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Student1 otherStudent) {

		return Integer.compare(getAge(), otherStudent.getAge());
	}

	public static void main(String[] args) {

		Student1 s1 = new Student1("Shrey", 5);
		Student1 s2 = new Student1("Adrit", 2);
		Student1 s3 = new Student1("Doll", 1);
		List<Student1> list_Students = new ArrayList<Student1>();
		list_Students.add(s1);
		list_Students.add(s2);
		list_Students.add(s3);

		System.out.println("Before sorting : " + list_Students);
		Collections.sort(list_Students);
		System.out.println("After sorting " + list_Students);

		
		
		
	}



}
