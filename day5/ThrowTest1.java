package com.org.gen.day5;

public class ThrowTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ArithmeticException a = new ArithmeticException();
			throw a;
		}catch (ArithmeticException e){
			System.out.println("ArithmeticException "+e.getMessage());
		}
	}

}
