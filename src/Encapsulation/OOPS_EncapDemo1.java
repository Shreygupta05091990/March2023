package Encapsulation;

public class OOPS_EncapDemo1 {
	
	
	
	public static void main(String[] args) {
		OOPS_EncapDemo demo = new OOPS_EncapDemo("Aman",45);
		
		
		demo.setAge(15);
		demo.setName("Saket");
	    System.out.println(demo.getName());
	    System.out.println(demo.getAge());		
	}

}
