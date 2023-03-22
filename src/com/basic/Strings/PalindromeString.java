package com.basic.Strings;

public class PalindromeString {

	public static void main(String[] args) {

		String Name="nammana";
		
		Boolean statusApproach1 = isPalindromeApproach1(Name);
		if(statusApproach1) {
			System.out.println("Input String is Palindrome");
		}
		else System.out.println("Input String is not  Palindrome");
		
		
		Boolean statusApproach2 = isPalindromeApproach2(Name);
		
		if(statusApproach2) {
			System.out.println("Input String is Palindrome");
		}
		else System.out.println("Input String is not  Palindrome");
		
			
		
		}// main

	
	public static boolean isPalindromeApproach1(String name) {
		
		StringBuilder sb = new StringBuilder(name);
		String reverseName =sb.reverse().toString(); 
		//Converting StringBuilder object to String Object by calling toString()
		return name.equals(reverseName);
	
		}//isPalindrome
	
	
	public static boolean isPalindromeApproach2(String name) {
		
		int lastCharIndex=name.length()-1;
		for(int i =0 ; i <=lastCharIndex/2; i++) {
			
			if (name.charAt(i)!=name.charAt(lastCharIndex-i))
				return false;
		}
		
		return true;
		
		
	}//isPalindromeMethod2
	
	
}//class 
