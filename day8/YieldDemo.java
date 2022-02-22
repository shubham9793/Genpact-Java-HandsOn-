package com.org.gen.day8;

public class YieldDemo implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YieldDemo y1 = new YieldDemo();
		Thread t1 = new Thread(y1,"First");
		
		YieldDemo y = new YieldDemo();
		Thread t2 = new Thread(y,"Second Thread");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Current Thread "+Thread.currentThread());
		Thread.yield();
		System.out.println(Thread.currentThread());
	}

}
