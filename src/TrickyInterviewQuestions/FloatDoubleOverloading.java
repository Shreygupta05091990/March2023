package TrickyInterviewQuestions;

public class FloatDoubleOverloading {

	void sum(float a , double b ) {
		System.out.println("Order of arguments  float , double ");
		System.out.println("a -> " + a);
		System.out.println("b -> " + b);
	}
	void sum( double b , float a  ) {
		System.out.println("Order of arguments  double , float ");
		System.out.println("a -> " + a);
		System.out.println("b -> " + b);
		
	}
	
	public static void main(String[] args) {
		
		FloatDoubleOverloading obj= new FloatDoubleOverloading();
		obj.sum(0.0f, 5.0d); // This is the ideal case 
		obj.sum(0d, 5); // This is the ideal case 
		obj.sum(0, 5); // What if I pass both integer values , why this ambiguity comes ?  
		
	}

}
