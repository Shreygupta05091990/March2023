package TrickyInterviewQuestions;

public class IntegerIntOverloading {

	public Integer add(Integer A, Integer B) {

		System.out.println("Method with Wrapper classes as arguments called");
		
		return A+B; // it can return null value as well
	}

	public int add(int A, int B) {
		
		System.out.println("Method with primitive type as arguments called");

//		return null; // Here , it is not allowed 
		return A+B;
	}

	public static void main(String[] args) {
		
		IntegerIntOverloading i= new IntegerIntOverloading();
		Integer primitive_Sum =i.add(2, 3);
		System.out.println(primitive_Sum);
		
		int wrapper_sum = i.add(Integer.valueOf(2), Integer.valueOf(4));		
		System.out.println(wrapper_sum);
		

	}

}
