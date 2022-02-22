package com.org.gen.day8HandsOn16feb;



class printEvenValue implements Runnable{
	MyMainClass mymain;
	int n;
	
	public printEvenValue(MyMainClass mymain, int n) {
		super();
		this.mymain = mymain;
		this.n = n;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=2;i<=n;i+=2) {
			mymain.printEven(i);
		}
	}
}



class printOddValue implements Runnable {

	MyMainClass mymain;
	int n;
	
	public printOddValue(MyMainClass mymain, int n) {
		super();
		this.mymain = mymain;
		this.n = n;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=n;i+=2) {
			mymain.printOdd(i);
		}
		
	}
	
}



public class MyMainClass {
		
		boolean e = false;
		
		public void printEven(int n){
			 synchronized(this) {
				if(!e) {
					try {
						wait();
					}catch (Exception e) {
						System.out.println("Thread Intrepted "+e.getMessage());
					}
				}
				System.out.println(Thread.currentThread().getName()+" - "+n);
				e = false;
				notify();
			}
		}
		
		
		public void printOdd(int n) {
			synchronized(this) {
				if(e) {
					try {
						wait();
					}catch(Exception e) {
						System.out.println("Thread Intrepted "+e.getMessage());
					}
				}
				System.out.println(Thread.currentThread().getName()+" - "+n);
				notify();
			}
		}
		public static void main(String args[]) {
			
			MyMainClass mymain = new MyMainClass();
			Thread thread1 = new Thread(new printEvenValue(mymain ,10),"Even");
			Thread thread2 = new Thread(new printOddValue(mymain ,10),"Odd");
			thread1.start();
			thread2.start();
	}
}
