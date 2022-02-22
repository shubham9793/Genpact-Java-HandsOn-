package com.org.gen.day5;

public class TrowExample {

	static void Checkdata(int x,int y) {
		if(x<15 && y<30) {
			throw new ArithmeticException("Student is not eligible for registrations");
		}else {
			System.out.println("Student is also is eligile for registration ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome");
		Checkdata(20,35);
		System.out.println("Done!!!!......");
		
	}

}
