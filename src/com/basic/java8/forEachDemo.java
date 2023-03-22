package com.basic.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.google.common.base.Predicate;

public class forEachDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Shrey");
		list.add("gupta");
		list.add("Shashank");
//		list.stream().forEach(l->System.out.println(l));

		java.util.function.Predicate<? super String> predicate = t->t.startsWith("g");
		
		
		// Filter list of names , starting with "S"
		List<String> new_list = list.stream().filter(predicate).collect(Collectors.toList());
		System.out.println(new_list);

		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("Shrey", 1);
		map.put("Shashank", 2);
		map.put("Arjun", 3);
		map.put("Rajit", 4);

		map.forEach((key, value) -> System.out.println("Key: " + key + " Value :" + value));
		// map.entrySet().forEach(obj->System.out.println(obj));
		map.entrySet().stream().filter(obj -> obj.getKey().contains("R")).forEach(obj -> System.out.println(obj));
		
	}

}
