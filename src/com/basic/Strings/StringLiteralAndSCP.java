package com.basic.Strings;

public class StringLiteralAndSCP {

	public static void main(String[] args) {

		String s1 = new String("Hello World"); // It creates 2 objects i.e in Heap & SCP .
		String s2 = "Hello World"; // SCP

		System.out.println(s1 == s2);// False - as references are being compared .

		if (s1.equals(s2)) {

			System.out.println("Content  of both is equal ");
		}

		String s3 = "Hello World";
		System.out.println(s2 == s3);// True: as both s1 and s2 are same & being referred from SCP.

		System.out.println(s1.intern()==s2.intern());
		
		
		System.out.println(s1.hashCode()==s2.hashCode());// Hashcode is a computed code 
		System.out.println(s1.hashCode()==s3.hashCode());
	}

}
