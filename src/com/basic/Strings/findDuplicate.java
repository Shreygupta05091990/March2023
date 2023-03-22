package com.basic.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class findDuplicate {
    public static void main (String args[]) {
        String input = "abcddd";
//        char[] ary = str2.toCharArray();
        String[] char_array = input.split("");  //    String Array here but actually it stores single character ["a", "y","b" ,"c", "d"]
        // Here , we have entered the  individual characters into collection Array List 
        
     ArrayList<String> list = new ArrayList<String>(Arrays.asList(char_array));
     
     System.out.println("Line 19");
     for (String str: list) {
    	 
    	 System.out.println(str);
     }
     
     

//Set does not allow duplicate elements
     Set<String> set = new HashSet<String>();
{
for ( String str : list) {
         if (set.add(str) == false) {
             System.out.println(str + " occurs: " + Collections.frequency(list, str) +": is the Duplicate Element");
         }else if (Collections.frequency(list, str) < 2) {
             System.out.println(str + " occurs: " + Collections.frequency(list, str));
         }
         
     }
   
}}
}



