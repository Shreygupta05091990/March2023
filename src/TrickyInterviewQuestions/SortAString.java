package TrickyInterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class SortAString {

	public static void main(String[] args) {
	   
		Scanner scn = new Scanner(System.in);
		
		String input = scn.next();
		char[] ch= input.toCharArray(); 
		Arrays.sort(ch); // This sorting happens in memory.
		for (int i = 0; i < ch.length; i++) {
			
			System.out.print(ch[i]);
			
		}
		

	 }
		
	}


