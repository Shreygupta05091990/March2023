package com.basic.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	/*
	
	@Override
	public void accept(Integer t) {
		System.out.println("Printing--> "+t );
		
	}
	
	*/
	
	public static void main(String[] args) {
		
	
		Consumer<Integer> consumer = (t) ->System.out.println(t);;
		consumer.accept(50);
		
		Integer[] a = new Integer[] {1,2,3,4};
		
		List<Integer> list = Arrays.asList(a);
		//list.stream().forEach(consumer);
		list.stream().forEach(t ->System.out.println("Printing t -> " + t));
		// The above line automatically understands that we have implemented consumer interface's accept method 
		//forEach() -- needs consumer interface variable, which defines accept method and internally passes accept method. in this
		
		
		
		 
		
		
	}

	
	
	
}
