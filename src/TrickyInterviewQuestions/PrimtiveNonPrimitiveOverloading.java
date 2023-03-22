package TrickyInterviewQuestions;

public class PrimtiveNonPrimitiveOverloading {

	void  calculate(Integer a) {
		
		System.out.println("With Integer as argument "+ a );
	}
	
	void calculate(int a) {
		System.out.println("With primitive  int  as argument " + a );
		
	}
	void calculate(Long  a) {
		System.out.println("With Wrapper LONG  as argument " + a);
		
	}
	void calculate(long  a) {
		System.out.println("With Wrapper long  as argument " + a);
		
	}
	
	public static void main(String[] args) {
		PrimtiveNonPrimitiveOverloading ab = new PrimtiveNonPrimitiveOverloading();
		ab.calculate(5);  //  it calls method with primitive data type 
		ab.calculate(new Integer(67)); // Method with wrapper class as arguments is called.
		ab.calculate(new Long(67));    // Method with wrapper class as arguments is called.
		ab.calculate(67L);
		
	}
}
