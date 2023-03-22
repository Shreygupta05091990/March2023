package LinkedList;

public class OuterClass {

	
	static class InnerClass{
		
		int a;
		int b;
		void display() {
			
			System.out.println("Accessing static  method of Nested Static Class ");
			
		}
		
	}
	void display() {
		
		System.out.println("Accessing   method from Outer  Class ");
		
	}
	
	
	public static void main(String[] args) {
		
		// How to call static methods of static class 
		InnerClass  ic = new InnerClass();
		ic.display();
		
		
		OuterClass oc = new OuterClass();
		oc.display();
		
	}
	
}
