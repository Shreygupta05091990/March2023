package TrickyInterviewQuestions;
/* Observation 
 * 
 * No common method for inheritance can be final in parent method 
 * 
 * 
 * */
class Parent1 {
	 void show() {
		
		System.out.println("Coming from Parent");
	}
	
	void display() {
		
		System.out.println("disp Coming from Parent");
	}
	
}



public class AccessMethodRestrictions extends Parent1 {
	
    void show() {
		
		System.out.println("Coming from Child");
	}

	public static void main(String[] args) {
		
		Parent1 ab  = new AccessMethodRestrictions();
		ab.show();
		ab.display();
		AccessMethodRestrictions abc = new AccessMethodRestrictions();
		abc.show();
		
		
		
	}

}
