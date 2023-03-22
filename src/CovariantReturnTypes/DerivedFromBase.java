package CovariantReturnTypes;

class Base {
	
	public Object  display() {
	return "0";
}
}
 class Derived extends Base {
	public String display(){
	return "Derived";
		
	}
	
}

public class DerivedFromBase {

	
	
	public static void main(String[] args) {
	
		Derived  d = new Derived();
		System.out.println(d.display());
		
		Base b = new Derived();
		System.out.println(b.display());
		
		Base base = new Base();
		System.out.println(base.display());
	}
	
}
	





