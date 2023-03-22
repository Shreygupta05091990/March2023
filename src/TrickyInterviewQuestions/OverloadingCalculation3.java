package TrickyInterviewQuestions;

public class OverloadingCalculation3 {

	void sum(int a, long b) {
		System.out.println("a method invoked");
	}

	void sum(long a, int b) {
		System.out.println("b method invoked");
		
	}

	
	
	public static void main(String[] args) {

		OverloadingCalculation3 obj = new OverloadingCalculation3();
		obj.sum(10, 20);// Here , the method sum(int,long) is ambiguous for this class
		obj.sum(20L, 15); // This works fine
		obj.sum(20, 2000000000L); // This works fine
	}
}
