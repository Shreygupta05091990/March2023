package TrickyInterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FilterFromHashMapWithEnhancedForLoop {
	
	
	
	
	public static void main(String[] args) {
		
		

Scanner scn = new Scanner(System.in);
String state = scn.next();

HashMap<String, String >  map= new HashMap<String ,String >();
map.put("Pune","MH");
map.put("Mumbai","MH");
map.put("Panjim","GOA");
map.put("Jaipur","RJ");
map.put("Ajmer","RJ");

Map<String,String> linkedHashMap = new LinkedHashMap<String, String>();
ArrayList<String> arrayList	= new ArrayList<String >(); 


for(Map.Entry<String, String>    entries : map.entrySet()) {
	if(entries.getValue().equals(state)) {
		linkedHashMap.put(entries.getKey(), entries.getValue());
		arrayList.add(entries.getKey());
		
	}
	
	
}
	System.out.println(linkedHashMap);	
	System.out.println(arrayList);
	}
	
}


