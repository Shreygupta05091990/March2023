package com.basic.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CoronaPatientsList {
	
	
	
	
	public static void main(String[] args) {
		
		
		List<Patient> patients = Stream.of(new Patient("P1", 21, "Corona", 25000),
				new Patient("P2", 45, "Dialysis", 50000),
		new Patient("P3", 67, "Corona", 100000),
		new Patient("P4", 10, "Corona", 5000)).collect(Collectors.toList());
		// Prints patients suffered from CORONA
		patients.stream().filter(o->o.getDisease().equals("Corona")).forEach(System.out::println);
		
		
		Double average_bill_paid = patients.stream().filter(o->o.getDisease().equals("Corona")).collect(Collectors.averagingInt(Patient::getAmount));
		System.out.println("Average Bill Paid : " + average_bill_paid);
		
		
		Map<String, List<Patient>> map =  patients.stream().collect(Collectors.groupingBy(Patient::getDisease));
        // How the internal map looks like : 
			/* Key    Values
			 * Corona-   [P1,P3,P4]
			 * 
			 */

	System.out.println(map);
	
	}
}