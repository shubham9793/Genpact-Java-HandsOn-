package com.org.gen.day1;

public class Primitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		short s = 20;
		byte b = 3;
		long l = 1029384878;
		float f = 87.74646f;
		double d = 876.7654d;
		
		short b1 = (short) (a+s); // Narrowing or type casting 
		int x = b+a; // widening 
		System.out.print("Integer i ="+a);
		System.out.println("Short s = "+s);
		System.out.println("byte b "+b);
		System.out.println("long l =" +l);
		System.out.println("Float f ="+f);
		System.out.println("double d ="+d);
		System.out.println("Narrowing = "+b1);
		System.out.println("widening ="+x);

	}

}
