package com.Threading;

public class AnotherThread extends Thread{

	@Override
	public void run() {
	   System.out.println("Printing from " + getName() );
	   try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		System.out.println("Another thread woke me up");
	}
	   System.out.println(getName() + "is awake after 5 seconds ");
		
	}
	
	
	

}
