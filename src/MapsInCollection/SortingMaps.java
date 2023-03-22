package MapsInCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortingMaps {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("eight", 8);
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);

		// Create a list of entries and create an arrayList which takes map.entrySet

		List<Entry<String, Integer>> entries = new ArrayList<Entry<String, Integer>>(map.entrySet());
		Collections.sort(entries, (o1, o2) -> o2.getValue().compareTo(o1.getValue())); // Sorts in Descending order
																						// based on Value .
		System.out.println(entries);
		Collections.sort(entries, (o1, o2) -> o1.getValue().compareTo(o2.getValue())); // Sorts in Ascending order based
																						// on Value .
		System.out.println(entries);

		Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));// Sorts in Ascending order based on
																					// Key .
		System.out.println(entries);

		Collections.sort(entries, (o1, o2) -> o2.getKey().compareTo(o1.getKey()));// Sorts in Descending oder based on
																					// Key .
		System.out.println(entries);
		
	}

}
