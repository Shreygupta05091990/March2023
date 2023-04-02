package Stacks;

import java.util.Stack;

public class StackImplementation {
	
	
	public static void main(String[] args) {
		
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push( 10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack+"-->"+ stack.peek()+ " "+stack.size());
		System.out.println(stack.size());
		stack.pop();
		System.out.println(stack+"-->"+ stack.peek()+ " "+stack.size());
		System.out.println(stack+"-->"+ stack.size());
		
		
	}

}
