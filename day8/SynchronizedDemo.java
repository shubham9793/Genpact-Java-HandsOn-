package com.org.gen.day8;


class Counter {
	int cnt;
	public synchronized void increment() {
		cnt++;
	}
}

public class SynchronizedDemo extends Counter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Counter c = new Counter();
		
		SynchronizedDemo c= new SynchronizedDemo();
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=1;i<=500;i++) {
					c.increment();
				}
				
			}
			
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=1;i<=500;i++) {
					c.increment();
				}
				
			}
			
		});
		
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("Counter "+c.cnt);
		
	}

}
