package CustomCollections;

import java.util.HashSet;
import java.util.Set;

public class SetDuplicateElements {

	public static void main(String[] args) {
		
		// In  HashSet<T>  implementation of Set , contract of HashCOde() and equals() is mandatory to follow.
		// If we dont implement this contract then , set will allow the duplicates .
		
		Set<Student>  Student_Set = new HashSet<Student>();
		Student s1 = new Student(1, "Shrey");
		Student s3 = new Student(1, "Shrey");
		Student s2 = new Student(2, "Shreya");
		

		Student_Set.add(s1);
		Student_Set.add(s3);
		Student_Set.add(s2);
		
		
		
		
		
		System.out.println(Student_Set);
		
		
	
	}

}
	