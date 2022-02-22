package com.org.gen.day7HandsOn;


class Thread1 extends Thread{
	int total = 1;
	public void run() {
		synchronized(this) {
			for(int i=1;i<=10;i++) {
				total +=i;
			} notify();
		}
	}
}

public class SyncronizationDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 b = new Thread1();
		b.start();
		synchronized(b) {
			try {
				System.out.println("Waiting for 2 min. to compelete......");
				b.wait();
			} catch (Exception e) {
				
			}
			System.out.println("Total is "+b.total);
		}
	}

}
