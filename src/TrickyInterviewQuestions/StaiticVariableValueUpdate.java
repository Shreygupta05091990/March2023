package TrickyInterviewQuestions;

public class StaiticVariableValueUpdate {

	static int a =5;
	
	public static void main(String[] args) {
		
		StaiticVariableValueUpdate val = new StaiticVariableValueUpdate();
		System.out.println(val.a);
		
		System.out.println("The value of static variable a is -->"+ a);
		a=10;
		System.out.println("The value of updated static  variable a is -->"+ a);
		jjkjk(a);
		
	}
	
	static void jjkjk(int a ) {
		a=55;
		System.out.println("Value inside the jjkjf methosd --> " +  a );
	}
	
}
