package HashMapConcept;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ConceptofHashMap {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String>   rollno_Name=  new HashMap<Integer, String>();
		rollno_Name.put(1, "Shrey");
		rollno_Name.put(1, "Ram"); // Here the old key is used 2 times , latest value replaces teh old one.
		rollno_Name.put(2,"Aman");
        Collection<String> String1 = rollno_Name.values(); // Returns a collection view of the values in the map.
        System.out.println(String1.size());
        ;
        
        System.out.println(rollno_Name.entrySet());
      
	}

}
