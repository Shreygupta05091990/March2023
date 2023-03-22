package Interview;



 public class A{
	
	static void staticmethod() {
		
		System.out.println("Static Method");
	}
}

class MainClass {
	
	public static void main(String[] args) {
	
		A a =null;
		A.staticmethod();  // Static methods are referenced  with null . 
        
		
	}

}