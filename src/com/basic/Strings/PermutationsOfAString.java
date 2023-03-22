package com.basic.Strings;

import java.util.HashMap;
import java.util.Scanner;

public class PermutationsOfAString {

	public static void  generateWords(int cs, int ts , HashMap<Character, Integer>  fmap , String asf) {
	
		
		if(cs >ts) {
			
			
			System.out.println(asf);
			return;
		}
		
		for (char ch :fmap.keySet()) {
			
			if (fmap.get(ch)>0) {
				
				fmap.put(ch, fmap.get(ch)-1);
				generateWords(cs+1, ts, fmap, asf+ch);
				fmap.put(ch, fmap.get(ch)+1);
			}
			
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
	
	Scanner scn = new Scanner(System.in);
	String input = scn.nextLine();
		
		
		
		
		int cs=1;
		int ts=input.length();
		String asf="";
		HashMap<Character, Integer>  fmap = new HashMap<Character, Integer>();
		
		
		  for (char ch : input.toCharArray()) {
			  
			  if (!fmap.containsKey(ch)) {
				  
				fmap.put(ch, 1);
				}
			  else 
				  fmap.put(ch, fmap.get(ch)+1);
		

			  
			  generateWords(cs , ts , fmap,asf);

}
}
	
}