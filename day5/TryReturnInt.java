package com.org.gen.day5;

public class TryReturnInt {

	@SuppressWarnings("finally")
	int m1() {
		try {
			System.out.println("Try Block");
			return 100;
		}catch (Exception e){
			System.out.println("Catche Block");
			return 300;
		} finally{
			System.out.println("This is Finally block");
			return 400;
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryReturnInt a = new TryReturnInt();
		System.out.println(a.m1()) ;
	}

}
