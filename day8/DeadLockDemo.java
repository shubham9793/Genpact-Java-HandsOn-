package com.org.gen.day8;

public class DeadLockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
		String rs1 = "Thread1";
		String rs2 = "Thread2";
		
		Thread t1 =  new Thread() {
			public void run() {
				synchronized (rs2) {
					System.out.println("Thread1:  locked resourece 1");
					try {
						Thread.sleep(20000);
					}catch(Exception e) {
					
					}
				
						System.out.println("Thread1 : looked for resource 2");
				}
			}
	};
		
		Thread t2 =  new Thread() {
			public void run() {
				synchronized (rs1) {
					System.out.println("Thread2:  locked resourece 2");
					try {
						Thread.sleep(20000);
					}catch(Exception e) {
					
					}
				
					System.out.println("Thread2 : looked for resource 1");
				}
			}
		};
		t1.start();
		t2.start();

	}

}
