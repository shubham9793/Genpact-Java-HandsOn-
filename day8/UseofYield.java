package com.org.gen.day8;

public class UseofYield  extends Thread  {

	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("Current Thread "+Thread.currentThread().getName()+" in Control");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UseofYield yd1 = new UseofYield();
		UseofYield yd2 = new UseofYield();
		yd1.start();
		yd2.start();
		for(int i=1;i<=3;i++) {
			System.out.println("Current Thread "+Thread.currentThread().getName()+" in Control");
		}
	}

}
