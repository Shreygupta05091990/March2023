/*  Here I am trying to fetch "Employee Name"   based on the keys "Id , DOB" provided in hashmap
  Fill the hashmAp with Employee Names , Pass the key to be looked out froom Hashap  
  
   
   Case 1: Without Overriding  the   implementation of HashCode() and equals()
           *Program Behaviour becomes  erratic and value can't be found with given key 
           * gives back NUll        

   Case 2:  Overriding the implementation of Hashcode() and equals() method 
           * Program runs normally , and right value is looked out in the set.
 
*/
package HashMapConcept;

import java.util.HashMap;
import java.util.Map;

public class HashCodeContractMap {

	
/* Classic case  where Key is an User Defined object*/	
	
	public static Map<EmployeeKey, String> loadEmployeeCache() {

		Map<EmployeeKey, String> cache = new HashMap<EmployeeKey, String>();

		cache.put(new EmployeeKey("101", "05091990"), "Shrey");
		cache.put(new EmployeeKey("102", "25071990"), "Pranjal");
		cache.put(new EmployeeKey("103", "19051990"), "Saksham");
		cache.put(new EmployeeKey("101", "05091990"), "Shrey1");

		return cache;

	} // loadcache()

	public static void main(String[] args) {

		Map<EmployeeKey, String> cacheLookup = loadEmployeeCache();
		System.out.println(cacheLookup);
		
		String empName = cacheLookup.get(new EmployeeKey("102", "25071990"));
		System.out.println(empName);
		
		
		
		
		
		

	}// main

}// class

class EmployeeKey {
     
	String id;
	String dob;

	public EmployeeKey(String id, String dob) {

		this.id = id;
		this.dob = dob;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	  
	 	@Override
	public String toString() {
		return "EmployeeKey [id=" + id + ", dob=" + dob + "]";
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeKey other = (EmployeeKey) obj;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}  
	 
}
