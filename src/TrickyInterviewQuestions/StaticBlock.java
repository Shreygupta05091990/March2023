package TrickyInterviewQuestions;

public class StaticBlock {

	static {
		final   int a =5;
		private int a =5;
		static int a=10;
		public int a=19;
		System.out.println("Inside static block " + a);
		
	}
	
	
	
	
	public static void main(String[] args) {
	
		System.out.println("Inside main method");
	    final int hj= 99;
	
	}

}
