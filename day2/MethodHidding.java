package com.org.gen.day2;


// in method overriding , method call is resolved by jnm based on runtime object (ne object)

// in method hidding method call is resolved by the compiler based on the refrence type object obj

class X {
	static void m1() {
		System.out.println(" x class  m1"); 
	}
	public void m2() {
		System.out.println("x class m2"); 
	}
}


class Y extends  X {
	static void m1() {
		System.out.println(" y class m1"); 
	}
	public void m2() {
		System.out.println(" y class m2"); 
	}
}


public class MethodHidding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x = new Y();
		x.m1(); // Method hidding 
		x.m2(); // method hinding 
	}

}
