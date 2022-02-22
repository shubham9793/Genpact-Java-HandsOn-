package com.org.gen.day5;


public class TryreturnTest {

	@SuppressWarnings("finally")
	int m1() {
		try {
			System.out.println("This is my try block");
		}catch(Exception e){
			System.out.println("This is my Catche block");
			return 200;
		}finally {
			System.out.println("This is my finally block");
			return 500;
		}
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryreturnTest y = new TryreturnTest();
		System.out.println(y.m1());
	}

}
