package com.org.gen.day5;

public class FinallyBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 20,b = 30;
		int c = 0;
		try {
			int sum = a+b;
			int a1 = a/c;
			System.out.println("sum is "+sum);
			
		}catch(NullPointerException  e) {
			int a1 = a/c;
			System.out.println(e+"Value is "+a1);
		}finally {
			int a1 = b/c;
			System.out.println("This is finally block ");
		}
		System.out.println("Outside of try block ");
	}

}
