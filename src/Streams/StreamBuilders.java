package Streams;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamBuilders {

	public static void main(String[] args) {
		
	// 1.Stream of Array 
	Stream<Integer>  stream1	= Stream.of((new Integer[] {1,2,3,4}));
	stream1.forEach(p->System.out.println(p));
		
	
	// 2. Stream from List 
	List<Integer> list = new ArrayList<Integer>();
   list.add(1);
   list.add(2);

   Stream<Integer>   stream2 =list.stream();
   stream2.forEach(p->System.out.println(p));
	}

}
