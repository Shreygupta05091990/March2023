package ThreadConcepts;

public class OwnThread   extends Thread{
	
	public void run() {
		
		System.out.println("Our own Thread starts  running here ");
		
	}

	public static void main(String[] args) {
		OwnThread ot= new OwnThread();
		ot.start();
		
		
																																																			

	}

}
