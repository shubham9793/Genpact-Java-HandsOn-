

/*
 * Q1) WAP to interrupt sleep method and due to interruption the 
sleep method will not execute successfully and it will throw 
interruption error that must be handled by catch block.
 * 
 * */


package com.org.gen.day8HandsOn16feb;

public class ThreadIntreptation extends Thread {
	
	public void run() {
		try {
			for(int i=1;i<=3;i++) {
				System.out.println("Child Thread");
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			throw new RuntimeException("Here Thread Interepted "); 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadIntreptation thread = new ThreadIntreptation();
		thread.start();
		
		try {
			System.out.println("Thread Running smoothlly");
			thread.interrupt();
		}catch(Exception e) {
			System.out.println("We are handled Exception in the catche block");
		}
		
	}

}
