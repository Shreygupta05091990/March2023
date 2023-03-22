package comparablecomparator;

import java.util.Comparator;

public class SortEmployeeByEmpID implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return Integer.compare(o2.getEid(), o1.getEid());
		
	}

}
