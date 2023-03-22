package TrickyInterviewQuestions;

public class PrePostIncrement {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;

		int c;
		int d;

		c = ++b; //3
		d = a++; //1
		System.out.println(c++);//3
		System.out.println(c); //4

		System.out.println("a " + a); //2
		System.out.println("b " + b);//3
		System.out.println("c " + c);//4
		System.out.println("d " + d); //1

	}

	void mehtod() {

		int z = 1; // Local variables need to be initialised or Variables inside method should be
					// initialised
		z = z + 2;
	}
}