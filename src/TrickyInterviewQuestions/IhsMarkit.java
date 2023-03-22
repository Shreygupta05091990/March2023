package TrickyInterviewQuestions;

public class IhsMarkit {

	
	   private static float temp(int a)
	      {
	 	     final float sum = 21; // static method can't have static variable 
			 return(sum);   // Pre increment operation 
	      }
	   
	   private  float temp() {
		    final float sum = 21; // static method can't have static variable 
			return(--(sum));   // Pre increment operation
		   
	   }
	public static void main(String[] args)
	        {
		IhsMarkit test = new IhsMarkit();
		
		System.out.println(test.temp());
	        }
	
	
	
	
	
}
