package com.org.gen.day3;

class B_ implements A,C {

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("Abstruct Method  m1");
	}
	
	static void m3( ) {
		System.out.println("Static Method overriden in class B_ ");
	}
}

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B_ b = new B_();
		b.m1();
		b.m2();
		A.m3();
		b.m3();
		C.m3();
	}

}
