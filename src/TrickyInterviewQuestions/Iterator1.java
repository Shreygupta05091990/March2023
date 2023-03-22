package TrickyInterviewQuestions;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Iterator1 {
	
	public static void main(String[] args) {
		
		

		List<String> arrayList= new ArrayList<String>();
		arrayList.add("Shrey");
		arrayList.add("Shantanu");
		arrayList.add("Saket");
		arrayList.add("Rohit");
		arrayList.add("Ayush");
//		java.util.Iterator<String> itr = arrayList.iterator();
     Iterator<String>  itr =  arrayList.iterator();
     // In iterator  , only operattions like Read and Remove elements  can be performed 
     
     // the logic here is , while iteration can elements be added or removed  from ArrayList .
     
     
      while(itr.hasNext()) {
    	  String str= itr.next();
    	 if ( str.charAt(0) == 'R') {
    		 
    		 itr.remove();
    	 }else {
    		 // Iterator doesnt allows any modification while iteration
           //arrayList.add("Shikhar"); // This is not allowsed , it will throw  ConcurrentModificationException
    	 }
    	  
      }
      System.out.println("The ArrayList size  with  iterator used  : " + arrayList.size()  );   
  System.out.println("The ArrayList with iterator used  : "+ arrayList);
  
  /****************************  Usage of List Iterator *************************************************/
  ListIterator<String> lstItr= arrayList.listIterator();
  while(lstItr.hasNext()) {
	  
	  String str = lstItr.next();
	  if ( str.charAt(0) == 'A') {
 		 
		  lstItr.set("Rohit"); // for Updating the object where the pointer is currently pointing
 	 }else {
 		 
// 		 arrayList.add("Shikhar");
 		 lstItr.add("Shikhar"); // adding the Object after the current pointer location.
 		 
 	 }
  }
  System.out.println("The ArrayList size with List iterator used  : " + arrayList.size()  );
  System.out.println("The ArrayList with List iterator used  : "+ arrayList);
  
  
}
}
