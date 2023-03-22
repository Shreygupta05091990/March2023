package com.basic.Strings;

public class StringInternExample {

	
	
	
		public static void main(String args[]){  
		String s1=new String("hello");   // Points to the object from Heap 
		String s2="hello";               // Points to the Object from SCP 
		String s3=s1.intern();//returns string from pool, now it will be same as s2  
		System.out.println(s1==s2);//false because reference variables are pointing to different instance  
		System.out.println(s2==s3);//true because reference variables are pointing to same instance  
		}
	}  	


 