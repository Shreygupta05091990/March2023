package TrickyInterviewQuestions;

import java.util.ArrayList;

/* How to avoid ArrayList storing duplicate elements/objects while addition itself */

public class CustomArrayList extends ArrayList{
	
	
	@Override
	public boolean add(Object o) {
		
		if(this.contains(o)) {
			return true;
			
		}else {
			
			return super.add(o);
		}
		
	}
	

	public static void main(String[] args) {
		
		CustomArrayList  arrList = new CustomArrayList();
		arrList.add(1);
		arrList.add(1);
		arrList.add(55);
		arrList.add(55);
		System.out.println(arrList.size());
		
		
		

	}

}
