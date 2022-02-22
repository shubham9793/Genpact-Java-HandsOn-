package com.org.gen.day8;

class Custormer{
	int D_amount = 10000;
	synchronized  void withDraw(int d_amount) {
		System.out.println("Going to Withdram");
		if(this.D_amount  < d_amount) {
			System.out.println("Infuluence balance");
			try {
				wait();
			}catch(Exception e) {
				
			}
			this.D_amount -= d_amount;
			System.out.println("Withdraw is complete");
		}
	}
	synchronized void deposit(int d_amount) {
		System.out.println("Going to deposit");
		this.D_amount += d_amount;
		System.out.println("Deposit Done......");
		notify();
	}
}


public class TestOne {
	public static void main(String [] args) {
		Custormer  c = new Custormer();
		new Thread() {
			public void run() {
				c.withDraw(50000);}
		}.start();
		new Thread() {
			public void run() {
				c.deposit(100);
			}
		}.start();
	}
	

}
