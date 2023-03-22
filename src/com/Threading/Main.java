package com.Threading;

public class Main {

	public static void main(String[] args) {
		System.out.println("Printing from the main Thread. ");
		Thread anotherThread = new AnotherThread();
		anotherThread.setName("----Thread A -----");
		anotherThread.start();// this is the way to invoke the run method . This thread starts the execution 
//		anotherThread.interrupt();
		
		//newThread.start();//Thread is already active , IllegalThreadStateException
		new Thread() {
			
			public void run() {
				
				System.out.println("Printing from the anonymous thread ");
			}
		}.start();
		
		System.out.println("Again printing from the main Thread. ");
		
		Thread myRunnable = new Thread(new MyRunnable());
		myRunnable.start();
	}
	
	
	

}
