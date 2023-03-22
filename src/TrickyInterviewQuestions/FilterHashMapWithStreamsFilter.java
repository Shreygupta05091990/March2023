package TrickyInterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterHashMapWithStreamsFilter {

	public static void main(String[] args) {

Scanner scn = new Scanner(System.in);
String state = scn.next();

HashMap<String, String >  city_State_map= new HashMap<String ,String >();
city_State_map.put("Pune","MH");
city_State_map.put("Mumbai","MH");
city_State_map.put("Panjim","GOA");
city_State_map.put("Jaipur","RJ");
city_State_map.put("Ajmer","RJ");
		
/* Streams become useful when I have to filter from any Map Object                  */ 
/******************************************** Using Streams  *********************************/
Map<String,String> filteredMap= city_State_map
							  .entrySet()
							  .stream()
							  .filter(x->x.getValue().equals(state)) // Filter accepts a predicate.
							  .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

System.out.println("Filtered Map is " + filteredMap);		

	}

}
