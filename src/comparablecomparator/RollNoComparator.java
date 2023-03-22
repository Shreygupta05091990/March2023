package comparablecomparator;

import java.util.Comparator;

public class RollNoComparator implements Comparator<Student2>{

	@Override
	public int compare(Student2 o1, Student2 o2) {
		
		return Integer.compare(o2.getRollNo(), o1.getRollNo());
	}

	
}
