package com.basic.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class HashMapPractice {
	
	
	

	

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		
		
		map.put(null, 1); //  Null can be the key in HashMap
		map.put("A", null); // A key in hashMap can have the null value  in key-Value pair 
		map.put(null,null); // This overrides the value kept by earlier null . 
		System.out.println(map);
		
		
		List<Entry<String,Integer>>  entries_list  = new ArrayList<>(map.entrySet());
		System.out.println(entries_list.get(0).getKey() +   "-->" + entries_list.get(0).getValue());
		System.out.println(entries_list.get(1).getKey()+ "-->" + entries_list.get(1).getValue());
		
		
		Set<Integer> set = new  TreeSet<Integer>((o1,o2)->o1-o2);
		//set.add(null);    
		set.add(10);
		set.add(10); //returns false
//		set.add(null);  /* A null value in a set can't be added */
		set.add(45);
		set.add(67);
		
		System.out.println(set);
		
		
		
	}

}
