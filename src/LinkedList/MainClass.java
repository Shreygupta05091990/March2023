package LinkedList;

public class MainClass {

	class NestedClass {

		int a;
		int b;

		void methodInsideNestedClass() {

			System.out.println("Inside nested classs method");
		}
	}
	
	
	void normalClassMethod() {
		
		System.out.println("Inside Normal CLass method");
	}

	public static void main(String[] args) {
		MainClass mainClass = new MainClass();
		mainClass.normalClassMethod();
		NestedClass nestedClass = new NestedClass();  
		// Above line is not resolved as , there is no enclosing of Outer Main Class .
		MainClass.NestedClass abc = new MainClass.NestedClass();
		nestedClass.methodInsideNestedClass(); // accessing method of Non-Static Inner Class
	}

}
