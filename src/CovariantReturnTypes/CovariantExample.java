package CovariantReturnTypes;


/* Wrapper Classes dont pl */

class A1 {

	A1 method(int  a) {

		return this;
	}

	void print() {

		System.out.println("From A1");
	}
}

class A2 extends A1 {
	@Override
	A2 method(Integer a) {  //  Primitive and Wrapper classes dont 

		return this;
	}
    @Override
	void print() {

		System.out.println("From A2");
	}

}

class A3 extends A2 {

	@Override
	A3 method() {

		return this;
	}
    @Override
	void print() {

		System.out.println("From A3");
	}
}

public class CovariantExample {

	
 public static void main(String[] args) {
	
	 A1 a1 = new A1();
	 a1.method().print();
	 
}	
	
}
