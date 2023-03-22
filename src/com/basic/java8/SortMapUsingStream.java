package com.basic.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import CustomImmutableClass.Employee;

public class SortMapUsingStream {
	
	
	public static void main(String[] args) {
		
		
	Map<String,Integer> map = new HashMap<String, Integer>();
	map.put("eight",8);
	map.put("one",1);
	map.put("two",2);
	map.put("three",3);
	
	/********************** Through Anonymous Inner Class  Sorting way of Map******************************************/

	List<Entry<String,Integer>> entries = new  ArrayList<>(map.entrySet());
	
	Collections.sort(entries,new Comparator<Entry<String,Integer>>() {

		@Override
		public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
			
			return o1.getKey().compareTo(o2.getKey());
		}
		
		
	
	});
	
System.out.println(entries);
	
	
	/********************** Through Lambda Expression  for COmparator  Sorting way of Map******************************************/
	
	Collections.sort(entries,(o1,o2)->   o2.getKey().compareTo(o1.getKey()));
		
		
//	System.out.println(entries);

	
	/********************** Through Stream API   Sorting way of Map******************************************/
	
   entries.stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
   //System.out.println(entries);
   
	
   
   
   /********************** Sorting using  Non Primitive CLass Property(here Age)   ******************************************/
   
   Map<EmployeeTaxEligibility,Integer> emap= new TreeMap<>(new Comparator<EmployeeTaxEligibility>() {

	@Override
	public int compare(EmployeeTaxEligibility o1, EmployeeTaxEligibility o2) {
		
		return o1.getAge()-o2.getAge();
	}
});
   		EmployeeTaxEligibility e1= new EmployeeTaxEligibility("Shrey", 30, "IT", 12000);
		EmployeeTaxEligibility e2= new EmployeeTaxEligibility("Shantanu", 31, "Consulting", 21000);
		EmployeeTaxEligibility e3= new EmployeeTaxEligibility("Saksham", 23, "HR", 5000);
   
		emap.put(e1,53);
		emap.put(e2,23);
		emap.put(e3,45);
//   System.out.println(emap); 
   
		 /********************** Sorting using  Non Primitive CLass Property(here Age)  with lambda Expression  ******************************************/
     
	Map<EmployeeTaxEligibility,Integer> emap1= new TreeMap<>(( o1, o2) ->o2.getAge()-o1.getAge()); 
	
	EmployeeTaxEligibility e11= new EmployeeTaxEligibility("Shrey", 30, "IT", 12000);
	EmployeeTaxEligibility e21= new EmployeeTaxEligibility("Shantanu", 31, "Consulting", 21000);
	EmployeeTaxEligibility e31= new EmployeeTaxEligibility("Saksham", 23, "HR", 5000);
			   
	emap1.put(e11,53);
	emap1.put(e21,23);
	emap1.put(e31,45);		
   
	System.out.println(emap1);
	
	
	// Converting Map to list using Entry and entrySet Object
	List<Entry<EmployeeTaxEligibility, Integer>> entries1= new ArrayList<>(emap1.entrySet());
	
	emap1.entrySet().
	stream().
	sorted(Map.Entry.comparingByKey(Comparator.comparing(EmployeeTaxEligibility::getSalary)))
    .forEach(System.out::println);
	
	System.out.println("**************************************");
	emap1.entrySet().
	stream().
	sorted(Map.Entry.comparingByKey(Comparator.comparing(EmployeeTaxEligibility::getAge).reversed()))
    .forEach(System.out::println);
	
	
   
	}	
	

}
