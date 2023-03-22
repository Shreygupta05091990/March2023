package TrickyInterviewQuestions;

public class IntegerLongOverloading {

	void sum(int  a , long  b ) {
		System.out.println("Method with Order of arguments  int  , long is called  ");
		System.out.println("a -> " + a);
		System.out.println("b -> " + b);
	}
	// How to call below method while  passing both  integer 
	void sum( long  b , int  a) {
		System.out.println("Method with Order of arguments  long , int  is called ");
		System.out.println("a -> " + a);
		System.out.println("b -> " + b);
		
	}
	
	public static void main(String[] args) {
		
		
		IntegerLongOverloading il = new IntegerLongOverloading();
		il.sum(2222222222222222222l, 3);// first parameter is long type
		il.sum(2,333333333333333333l);// first parameter is long type
		il.sum(2, 3);//Unable to compile this line , says its ambiguous method
		il.sum(2,(long)3);  // This works fine 
		il.sum((long)3, 5); // This works fine 
		il.sum((long)5,(long)7));  // Here , casting both integers to long 
		

	}

}
