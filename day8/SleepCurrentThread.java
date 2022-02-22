package com.org.gen.day8;

public class SleepCurrentThread implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello running thread");
		try {
			Thread.sleep(2000);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("Java");
		System.out.println("Curret Thread :"+Thread.currentThread());
	}
	
	

	public void m1() {
		System.out.println("m1 Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepCurrentThread sp = new SleepCurrentThread();
		Thread t = new Thread(sp," Child Thread");
		t.start();
		System.out.println("Number of Active Thread : "+Thread.activeCount());
		sp.m1();
	}	
}
