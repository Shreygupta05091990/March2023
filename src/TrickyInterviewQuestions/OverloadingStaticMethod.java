package TrickyInterviewQuestions;

public class OverloadingStaticMethod {
	
	 float  add(int a, int b) {
        return a + b;
    }

    int add(int a, int b) {  
        return a + b  ;
    }
    
    int add(int a,int b ,int c ) {
       return a+b+c;	
    	
    }
	
	
	// Here , 2 methods with exactly same name and definition exist
    // Compiler says , duplicate method 
    // Static keyword  is indifferent for method  overloading with same definition 

	public static void main(String[] args) {
	   	
		OverloadingStaticMethod ab = new OverloadingStaticMethod();
		ab.add(10, 15);
		
		OverloadingStaticMethod.add(a, b);
	

	}

}
