package LinkedList;

public class EmployeeDoublyLinkedList {
	
	private EmployeeNode head;
	private EmployeeNode tail;
	private  int size;
	
	
	public void  addToFront(Employee employee) {
		EmployeeNode node  = new EmployeeNode(employee);
		node.setNext(head);
		head = node;
		size++ ;
		
	  }

}
