package TrickyInterviewQuestions;

class Child extends Parent {
	int x = 20;

	@Override
	public void show() {
		System.out.println("Inside Child show()");
	}

	public void display() {
		System.out.println("Inside child display()");
	}

	public static void main(String[] args) {

		Parent p = new Child();
		// Parent class  can call its own property and methods with its reference 
		p.show();
		p.show1();
		// But parent class  can't call child properties  which dont belong to parent directly .
		p.display(); // With Reference variable of Parent , it can call only common methods present
						// in both child and parent class.
		Child c = new Child();
		c.display();
		System.out.println(p.x); // Variable Over-riding doesnt takes place in Inheritance 
	}
}
