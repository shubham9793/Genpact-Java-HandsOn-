package com.org.gen.day3;

public interface A {
	default void m1() {
		System.out.println("Default m1");
	}
	void m2();
	
	static void m3() {
		System.out.println("Static Method of interface m3");
	}
}
