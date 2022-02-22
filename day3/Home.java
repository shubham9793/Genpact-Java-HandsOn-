package com.org.gen.day3;

public interface Home {
	void HomeLoan();
	
	default void m2() {
		System.out.println("Default Method ");
	}
}


