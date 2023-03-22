package com.basic.Strings;

public class Count_Vowels_Consonants_String 
{
	public static void main(String[] args) 
	{
		int vCount = 0;
		int cCount = 0; 
		
		String str = "Read a simple sentence";
		System.out.println( " The string length is " + str.length());
		str= str.toLowerCase();	//To reduce validation
			
		
		
		for(int i =0; i<str.length(); i++) 
		{
           //logic for vowel validation
                     if(str.charAt(i) == 'a' || 
                        str.charAt(i) == 'e' || 
                        str.charAt(i) == 'i' || 
                        str.charAt(i) == 'o' || 
                        str.charAt(i) == 'u') 
            { 
            	{
            		vCount = vCount + 1;
            	}
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') //  this checks for spaces.
            {
            	{
            		cCount = cCount + 1;
            	}
            }
		}
        System.out.println("Number of vowels: " + vCount);    
        System.out.println("Number of consonants: " + cCount); 
	}
}
