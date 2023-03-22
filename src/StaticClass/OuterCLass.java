package StaticClass;

public class OuterCLass { // It is a Nested Class

	private static  String msg = "GeeksForGeeks";

	 public static class InnerStaticClass { //  Nested Static Inner Class
		
		public void message() {
			
			System.out.println("The message from Nested Static class " +msg );
		}
		

	}
	
	public  class InnerNonStaticClass{ //  Non-static Inner Class 
		
		 public void message() {
				
				System.out.println("The message from Non  Static Inner class ");
			}
		
		
	}
	
	
	public static void main(String[] args) {
		
		OuterCLass.InnerStaticClass isc = new OuterCLass.InnerStaticClass();
		isc.message();
	}
	

}
