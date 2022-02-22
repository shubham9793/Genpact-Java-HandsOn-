package com.org.gen.day8;

public class ThreadDemo  extends Thread {

	String task;
	
	public ThreadDemo(String task) {
		super();
		this.task = task;
	}
	public void run() { //running state
		for(int i=1;i<=5;i++) {
			System.out.println(task +": "+i );
			
			try {
				Thread.sleep(1000);
				
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo th1 = new ThreadDemo("cut the Ticket"); // new born thread
		ThreadDemo th2 = new ThreadDemo(" show the Ticket"); // new born thread
		Thread t = new Thread(th1);
		 
		
		Thread f = new Thread(th2);
		t.start(); // runnable state
		f.start();
		
	}

}
