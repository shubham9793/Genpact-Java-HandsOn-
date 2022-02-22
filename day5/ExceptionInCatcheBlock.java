package com.org.gen.day5;

class ExceptionInCatcheBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10,b=0;
		
		try {
			int c = a/b;
			System.out.println("Try block "+c);
		}catch(Exception e ){
			int c = a/b;
			System.out.println(c);
		}finally {
			System.out.println("This is my finally block");
			System.out.println(100/0);
			
		}
	}

}
