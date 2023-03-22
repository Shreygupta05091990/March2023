package CovariantReturnTypes;

class A11{
	
}
class B11 {
	
}

class Base1{
	
	A11  display(){
		return new A11();
		
	}
	
}
class Derived1 extends Base1 {
	B11 display() {     // Compile time error , the return type is non-compatible. 
		
		return new B11();
	}
	
}

public class NonCovariantReturnTypes {

	public static void main(String[] args) {
		

	}

}
