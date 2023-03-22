package TrickyInterviewQuestions;

public class MethodOverloading {
	// Return Type of method doesn't play any role  in method overloading 
	// Method Name should be same 
	// Order of Parameters 
	int  sum (int a ,int b ) {
		System.out.println("Sum with A and B");
		return a+b;
	}
	
	void  sum (int c , int d , int e) {
		
		
		
	}
	long sum(int f , long g ) {
		System.out.println("Sum with F and G");
		return  f+g;
	}
	
	public static void main(String[] args) {
		
		MethodOverloading mo= new MethodOverloading();
		mo.sum(2,3);
		mo.sum(2, (long)3);
		
	}

}
