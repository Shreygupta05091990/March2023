package comparablecomparator;

import java.util.Comparator;

public class AgeComparator  implements Comparator<Student2>{

	@Override
	public int compare(Student2 o1, Student2 o2) {
		
		return Integer.compare(o1.getAge(), o2.getAge());
		
	}

	
	
	
    
	
	
	
	
	
	
	
}
