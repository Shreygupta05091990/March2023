package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class SubsequencesOfaString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str  = scn.nextLine();
		ArrayList<String>  ss = getSS(str); // get Subseqence 
		System.out.println(ss.size()+"-->" +ss);
		
	}

	private static ArrayList<String> getSS(String str) {
		
		if (str.length() ==0 ) {
			
			ArrayList<String>  bres= new ArrayList<String>();
			bres.add("");
			return bres;
		}
        
		char ch = str.charAt(0);
		String ros = str.substring(1);
		// Faith that  , we get the subsequences of  the rest of the string .
		ArrayList<String>  rres =  getSS(ros); // Faith statement 
		ArrayList<String>  mres =  new ArrayList<String>();
		for(String rstr: rres ) {
			mres.add("" + rstr );
			mres.add(ch + rstr );
			
	}
		return mres;
	}

}
