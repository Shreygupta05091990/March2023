package MultiThreading;

public class CustomThread extends Thread{
	private static ThreadLocal<String>  fdfd =new ThreadLocal<String>();

	public static void main(String[] args) {
		
		 CustomThread customThread   = new CustomThread();
		 
		customThread.start();
		System.out.println(customThread.getThreadGroup().getName());
		fdfd.set("jhdhdjfhjdhfj");
		System.out.println(fdfd.get());
	   
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
	
   
	
	
	
}
