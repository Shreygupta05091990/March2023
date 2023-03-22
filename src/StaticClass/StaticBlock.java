package StaticClass;

public class StaticBlock {

	static {
		int a = 5;
		System.out.println("Inside static block...... " + a);
		
	    

	}

	public static void main(String[] args) {

		System.out.println("Inside main method");
		int a = 90;
		System.out.println("Value of a inside main block ...." + a);

	}

}
