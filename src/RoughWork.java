
public class RoughWork {
	
	
	public static void main(String[] args) {
		
		String input = "Shrey GUPTA GGGGG";
		
		char[]  ch_arr = input.toCharArray(); // Returns char Array 
		
		
		for(int i =0;i<input.length() ; i++) {
		char ch =input.charAt(i);    // Returns single character and is stored
		}
		
		System.out.println("Line 17 ");
		String[]  str_arr = input.split(" "); // Returns String array on basis  of spaces 
		for(String str:str_arr) {
			
			System.out.println(str);
		}
		
		
		System.out.println("Line 25 ");
		System.out.println(input.replace('S', '!'));
		System.out.println("Line 26 ");
		System.out.println(input.replaceAll("G", "H"));
		
		StringBuffer   sb = new StringBuffer(input);
        for (int i = 0; i < sb.length(); i++) {
        	
			System.out.println(sb.charAt(i));
		}
	
        StringBuffer sb1  = new StringBuffer(input.replace('S', '!'));
        
        
        
	
	
	
	}

	
	
	
}
