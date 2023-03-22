package com.basic.Strings;

public class RemoveSpecialCharacters {
	
	
	
public static void main(String[] args) {
	
	
	
	String str= "This#string%contains^special*characters&.";
	String resultStr= "";
	for (int i = 0; i < str.length(); i++) {
		
		if (str.charAt(i)>64 &&str.charAt(i)<=122) {
			
			resultStr= resultStr+str.charAt(i);
			
		}
		
	}
	System.out.println("The string after removal of Special Characters is " + resultStr);

}
}
