package com.org.gen.day4;

public class TryCatchBlock1 {
	int x = 30,y = 0;
	void divid() {
		System.out.println("I am a method and my x value is  "+x);
		try {
			
			
			System.out.println("Inside Try block");
			int z = x/y;
		}catch (ArithmeticException e) {
			System.out.println("Result "+e);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchBlock1 t = new TryCatchBlock1();
		t.divid();
		
	}

}
