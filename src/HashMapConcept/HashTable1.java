package HashMapConcept;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;

public class HashTable1 {
	
	
	public static void main(String[] args) {
		
		
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		Collections.synchronizedMap(hmap); //Returns a thread Safe 
	}

}
