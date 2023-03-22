/*   

    ProblemStatement -  In User  Defined data type, HashSet allows duplicate entry 
    Question-  How to  avoid Duplicate entry to HashSet ?
    Solution : Over-riding HashCode() implementaion from Object Class is a solution 
   
    Example Code: 
    
       Employee Class -   2 Fields(Id , DOB) 
       Added to HashSet 
       toString()-- to display String representation of Collection Object 






*/package HashMapConcept;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashCodeContractSet{



	public static void main(String[] args) {

    Employee e1= new Employee( "1", "05091990");
    Employee e2= new Employee( "2", "05091990");		
    Employee e3= new Employee( "3", "05091990");
    Employee e4= new Employee( "1", "05091990");
		
    
    Set<Employee>  set = new  HashSet<Employee>();
    set.add(e1);
    set.add(e2);
    set.add(e3);
    set.add(e4);
    System.out.println(set);
    
	}// main

}// class

class Employee {



	 
	@Override
	public String toString() {
		return "Employee [id=" + id + ", dob=" + dob + "]";
	}

	String id;
	String dob;

	public Employee(String id, String dob) {

		this.id = id;
		this.dob = dob;
	}

	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + ((dob == null) ? 0 : dob.hashCode()); result =
	 * prime * result + ((id == null) ? 0 : id.hashCode()); return result; }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Employee other = (Employee) obj; if (dob == null) { if (other.dob !=
	 * null) return false; } else if (!dob.equals(other.dob)) return false; if (id
	 * == null) { if (other.id != null) return false; } else if
	 * (!id.equals(other.id)) return false; return true; }
	 */
}
