package com.basic.Strings;

public class RemoveSpaces {

	public static void main(String[] args) {
		
		String input_string= "Ramisagoodboy";
		String input= trimString(input_string);
		int cnt=0;
		for(int i=0;i<input.length();i++) {
		 	char ch = input.charAt(i);
		 	if (ch==' ') {
		 		
		 		cnt++;
		 	}
			
		}
		
			System.out.println("The number of words in String are : " + ++cnt );
	}

	public static String trimString(String inputString) {
		
		
		return inputString.trim();
	}
}
