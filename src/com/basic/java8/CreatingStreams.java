package com.basic.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.base.Predicate;

public class CreatingStreams {

	public static void main(String[] args) {
		
		
		// Writing the Lambda Expressions: 
		/*
		  interface abc {
		  int total(a,b)
		  
		  }
		
		
		*/
		
		
		
		
		
		
		

		/*
		 * How to create stream from integer , character , String and print the elements from Stream
		 * 
		 */

		// integer stream
		Stream stream = Stream.of(1, 2, 4, 25, 7, 8, 9, 2);
		stream.forEach(obj -> System.out.print(obj + " "));

		// String Stream
		Stream string_stream = Stream.of("My", "name", "is", "Shrey", "Gupta");
		string_stream.forEach(o -> System.out.print(o + " "));

		// Character Stream
		Stream char_stream = Stream.of('a', 'b', 'c', 'd', 'e');
		char_stream.forEach(o -> System.out.print(o + " "));
		
		
		// How to create Stream from Arrays, ArrayList 

	    Integer[] array =new Integer[] {1,1,2,3};
	    
	    long count = Arrays.stream(array).filter(o->o%2!=0).count(); 
	    System.out.println("Elements count in Stream = " + count);// only count is given 
	   List<Integer> list = Arrays.stream(array).filter(o->o%2!=0).collect(Collectors.toList());
	   System.out.println("Elements in List--->");
	    list.forEach(obj->System.out.println(obj));
	    
	    Set<Integer> set = Arrays.stream(array).distinct().collect(Collectors.toSet());
	    System.out.println("Elements in Set--->");
	    set.forEach(o->System.out.print(o+" "));
	    
	    String[] str_array= new String[] {"dsdsd","dsds","abc"};
	    List<String> hjhj =  Arrays.stream(str_array).filter(o->o.startsWith("a")).collect(Collectors.toList());
	   
	   System.out.println(hjhj);
	   
	     //Stream of Custom Data Type 
	    List<Employee>  employee  =  Stream.of(new Employee(1,"Basant", "Dev", 6000),
				  new Employee(2,"Saksham", "Dev", 7000),
				  new Employee(3,"Shrey", "QA", 7000),
				  new Employee(4,"Shreyansh", "QA", 4500),
				  new Employee(5,"Naveen", "Devops", 9000))
				   .collect(Collectors.toList());
	    // Below Map contains -->Department(String) , List of Employees(List<Employees>)
	    Map<String, List<Employee>> map=   employee.stream().collect(Collectors.groupingBy(Employee::getDept)).;
	    
	    
	    System.out.println(map);
	    
	    char[] ch1 = new char[] {'g','h'};
	    System.out.println(ch1[1]);
	    Character[] ch =new Character[] {'a','b'};
	    		System.out.println(ch[1]);
	    		
	    }
	    
	    
		
	}


