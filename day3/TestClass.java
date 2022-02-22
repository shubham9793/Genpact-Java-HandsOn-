package com.org.gen.day3;

abstract class Myclass {
	int x = 100;
	abstract void calculate(int a,int b);
	
	public int datacount(int a) {
		return a*a;
	}
	
	public Myclass() {
		super();
		System.out.println("Abstract class Constructor");
	}
	public static void call() {
		System.out.println("This is Static method");
	}
	final void m1() {
		System.out.println("this is final method");
	}
}

class MainChild extends Myclass {

	public MainChild() {
		super();
		System.out.println("Child class Constructor");
		// TODO Auto-generated constructor stub
	}

	@Override
	void calculate(int a, int b) {
		// TODO Auto-generated method stub
		int sum = a+b;
		System.out.println("sum is"+sum);
		
	}

	
}
public class TestClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainChild m = new MainChild();
		m.calculate(52, 52);
		System.out.println(m.datacount(3));
		
	}

}
