package LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream.GetField;

public class Main {

	public static class Node {
		int data; // Data part of the current node
		Node next; // Address part of the next node

	}

	public static class LinkedList {

		Node head;
		Node tail;
		int size;

		void addLast(int val) {

			Node temp = new Node();
			temp.data = val;
			temp.next = null;
			if (size == 0) {

				head = tail = temp;

			} else {

				tail.next = temp; // replaces current nodes value .
				tail = temp;

			}
			size++;

		}
		
		public int  size() {
			
			return size;
		}
		
		public void display() {
			
			Node temp = head ; 
			while(temp!=null) {
				
				System.out.print(temp.data + " ");
				temp=temp.next;
			}
			System.out.println();
		}
		
		public void removeFirst() {
		
		if(size==0) {
			
			System.out.println("LinkedList is an empty Linked List ");
			
		}else if (size==1){
			head=tail=null;
			size=0;
			
		}
		else {
		head = head.next;
		size--;
			
		}
		
		}
		public void removeLast() {
			
			if(size==0) {
				
				System.out.println("LinkedList is an empty Linked List ");
				
			}else if (size==1){
				head=tail=null;
				size=0;
				
			}
			else {
				Node temp = head;
			    for(int i =0 ; i<size -2 ; i++) {
			    	temp = temp.next;
			    }
			    tail=temp;
			    temp.next=null;
			    
			    		
				size--;
				
			}
			
			
			
		}
		
		public int getFirst() {
        if (size==0) {
        	System.out.println("It is an empty  list ");
        	return -1;
		}else {
			return head.data;
			
		}
		}
		public int getLast(){
			if (size==0) {
	        	System.out.println("It is an empty  list ");
	        	return -1;
			}else {
				
				return tail.data;
			}
	}
		
		public int getAt(int index) {
			
			if (size==0) {
				System.out.println("It is an empty  list ");
				return -1;
				
			}else if(index < 0 || index >=size) {
				System.out.println("Invalid index ");
				return -1;
				
				
			}else {
				Node temp = head;
				for (int i= 0; i<index  ; i++) {
				   temp= temp.next;	
				}
				return temp.data;
			}
			
			
		}
		
		public void addAtIndex(int index , int val) {
			
			
			if (index<0 || index > size	) {
				System.out.println("It is an invalid Index");
				
			  } else if(index ==0) {
				 addFirst(56);
				  
				  
			  }else if  (index == size) {
				  addLast(265);
				  
			  }
			  else {
				  Node node= new Node();
				  node.data=val;
				  Node temp  = head;
				  for(int i=0 ; i<index-1; i++) {
					temp=temp.next;  
					  
				  }
				   node.next = temp.next;
				   temp.next= node;
				   size++ ;
			  }
			
		}
		
		public void addFirst(int val) {
			Node temp = new Node();
			temp.data = val;

			if (size == 0) {
				head = temp;
				head.next = null;
				tail=temp;

			} else {

				temp.next = head;
				head = temp;

			}

			size++;

		}
		
	    private Node getNodeAt(int index) {
	    	Node temp=head;
	    	for(int i=0; i<index ; i++ ){
	    		temp =temp.next;
	    		}
	    	return temp;
	    	 }
	    	
	    
		
		public void reverseDI() { // Data iterative approach , where Data is being replaced in Nodes 
	    	
	    	int li = 0 ;  //  Left Index 
	    	int ri = size-1 ; // 
	    	while(li < ri) {
	    		
	    		Node left = getNodeAt(li);
	    		Node right = getNodeAt(ri);
	    		int temp = left.data;
	    		left.data= right.data;
	    		right.data=temp;
	    		
	    		li++;
	    		ri--;
	    	}
	    }
	    public void reversePI() {
	    	
	    	Node prev= null;
	    	Node curr= head;
	    	
	    	while(curr!=null) {
	    		
	    		Node next= curr.next;
	    		
	    		curr.next = prev;
	    		prev= curr;
	    		curr = next;
	    		
	    		
	    	}
	    	Node temp = head;
	    	head = tail ;
	    	tail= temp;
	    }
		
		  public void removeAt(int index) {
		  
			  if (index < 0 || index >=size) {
				  
				  System.out.println("Invalid arguments ");
			  }else if (index ==0){
				  removeFirst();
				  
				  
			  }else if (index==size -1 ) {
				  removeLast();
				  
			  }else {
			  
			  
			  Node temp=head;
		    	for(int i=0; i<index-1 ; i++ ){
		    		temp =temp.next;
		    		}
		    	temp.next =temp.next.next;
		    	size--;
		       
		  }
		 
		
		  }
	public static void testList(LinkedList list) {

		for (Node temp = list.head; temp != null; temp = temp.next) { // Here , the traversal is between the nodes .
			System.out.println(temp.data);

		}
//		System.out.println(list.size);
		if (list.size > 0) {

			System.out.println(list.tail.data);
		}

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList list = new LinkedList();
/*		String str = br.readLine();
		while (str.equals("quit") == false) {
			if (str.startsWith("addLast")) {

				int val = Integer.parseInt(str.split(" ")[1]);
				list.addLast(val);

			}
			str = br.readLine();
		}*/
		//testList(list);
//		System.out.println("The size of linked list is " + list.size());
//		System.out.println("The elements in Linked List are " );
//		list.display();
//		System.out.println("Removing the first element ");
//		list.removeFirst();
//		System.out.println("Updated list after removing ");
		
		System.out.println("The size of linked list is " + list.size());
	
//		System.out.println( "First element in linked list is " +  list.getFirst());
//		System.out.println( "Last element in linked list is " +  list.getLast());
//		System.out.println( " Element at index  in linked list is " +  list.getAt(2));
	   
		list.addFirst(152);
		
		list.addFirst(15);
	    list.addFirst(26);
	    list.addFirst(27);
	    list.addFirst(28);
	    list.addAtIndex(2,5666);
		list.display();
	    list.removeLast(); 

		System.out.println("The size of linked list after removing  " + list.size());
		list.display();
//		System.out.println("The reversed linked list is : ");
//		list.reverseDI();
//		list.reversePI();
		list.removeAt(2);
		list.display();
	}
	
}
}