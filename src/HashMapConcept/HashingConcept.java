
package HashMapConcept;
public class HashingConcept {
	
/*  
  HashMap is an implementation of Map Interface!!
   Works like a dictionary 
   NUll key is also allowed here , Null Key has  hash value of 0.
  
  1. Hashing is like converting an Object into small fixed length integer 
     Example- Large string can be converted into fixed length small integer.
     	
  2. It helps in faster indexing and look ups or searches .
  
  2.1 It uses an array and LinkedList data structure internally for storing Key and Value.  
  
  3. Contract between HashCode() and Equals()  : 
     If 2 objects are equal  , they should have same HashCode() as well
     
  4. Why this contract is important , it is important because:
     HashCode() is used in storing values into the HashMap   
      	
	
	============HashMap Internal Implementation ==========================
	
	By Default , HashMap comes with a table/array  of size 16(0 to 15) 
	
	Each Index in the table is known as bucket , each bucket is a node , which in turn  
	can be a linked list of nodes.
	
	When 1st PUT  operation happens :
	 o> hash(key) - key is passed to hash function which returns an integer called HashCode
	 o> Now,  we have to compute the index where can this HASHCODE can be accommodated
	    in the Table(which bucket can store this Hashcode)     
	 o> Now,as per the index returned , the particular  entry is taken as node in the  table  
	
	Case 1 : When second PUT operation happens - different index is returned  
	 
	 o> The value is stored as  a node( so that can accommodate more in future and work as a
	    linked list)  in the bucket(of a table)
	    
	    
	    
	Case 2:  When second PUT operation happens - same  index is returned.
	   
	 o> The collision happens as already an element(node) sits at that index , 
	    the role of that node becomes important  here .
	 o> The new entry will be added as a next node of already existing node .   
	    The pointer of previous  element points to new node 
	 
	     
	     
	
	
	
	
	
*/
}
