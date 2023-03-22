package StaticClass;

public class StaticBasedQuestions {

	static void staticMethod() {

		System.out.println("Inside Static Method");
	}

	public static void main(String[] args) {
		StaticBasedQuestions sbq = new StaticBasedQuestions();

		System.out.println(sbq);// Prints the reference it is pointing to .

		sbq = null;// Resetting reference to null

		System.out.println(sbq); // null

		staticMethod(); // Output of this line is "Inside Static Method"
		staticMethod(5);// Overloaded static method which accepts Integer as arguments

		sbq.staticMethod(80); // Output of this line is "Inside Static Method 80"

		System.out.println(sbq);

	}

	static void staticMethod(int a) {

		System.out.println("Inside Static Method " + a);
	}
}
