package TrickyInterviewQuestions;

public class CompileError {
	
	
	public static void main(String[] args) {
		
		
		for (int i = 0; i<8; i++) {    // the central condition has to be boolean 
			if (i<5) {
					System.out.println("Hello "+i);
					break;
		}
		
	}
		
		int x;
		x=5;
		{
			
			int y=6;
			System.out.println(x+" " +y);
		}
		System.out.println(x+" " +y);  // here the varible y is declared inside the 
		
}
}