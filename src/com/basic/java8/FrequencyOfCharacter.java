package com.basic.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		
		//Collectors.
		
		String input="fhdjhjdhfja";
		Map<String,Long> hmap = Arrays.stream(input.split(""))// Splits into a string array
				.collect(
						Collectors.groupingBy(
								Function.identity(),Collectors.counting()
								
											 )
				        );
		for(Map.Entry<String, Long> entry:hmap.entrySet() ) {
			
			if(entry.getValue()=='a') {
				
				System.out.println(entry.getValue());
			}
			
			
		}
	}
	
}
