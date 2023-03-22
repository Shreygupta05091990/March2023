package com.Threading;

public class Main1MutipleThreads {

	public static void main(String[] args) {
		
		CountdownThread t1 = new CountdownThread(Countdown);
		t1.setName("Thread 1");

	}

}

class Countdown {
	
	
public 	void doCountDown() {
		
		String color;
		switch (Thread.currentThread().getName()) {
		case "Thread 1":
			color= ThreadColor.ANSI_BLACK;
			break;
		case "Thread 2":
			color= ThreadColor.ANSI_GREEN;
		default:
			color= ThreadColor.ANSI_GREEN;
		}
		
		for (int i = 10; i >0; i--) {
			
			System.out.println(color + Thread.currentThread().getName()+": i =  "+i);
		}
		
	}
	
	 
}

class CountdownThread extends Thread{
	
	private Countdown threadCountdown;

	public CountdownThread(Countdown countdown) {
		threadCountdown = countdown;
	}

	@Override
	public void run() {
		
		
	}
	
	
}