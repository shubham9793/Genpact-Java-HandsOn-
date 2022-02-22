package com.org.gen.day5;

public class throwTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		for( i=1;i<=10;i++) {
			try {
				if(i == 5)
					throw new ArithmeticException("ArithmeticException");
				else if(i < 2) 
					throw new RuntimeException("RuntimeException");
				else if(i>9) 
					throw new NullPointerException("NullPointerException");
			}catch(Exception e) {
				System.out.println("Exception caught");
				System.out.println("Exception is "+e.getMessage());
				
			}
		}
		

	}

}
