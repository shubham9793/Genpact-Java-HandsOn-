package com.org.gen.day2HandsOn8thFeb;

/*
 * Question 5
 * Create a class calculator where mention addition subtraction methods
 *  that can explain the method overloading feature . 
 * 
 * */


class Calculater {
	void sum(int a,int b) {
		int s = a+b;
		System.out.println("sum of two number " +s);
	}
	
	void sum(int a,int b,int c) {
		int s = a+b+c;
		System.out.println("sum of three number is " +s);
	}	
	
	
	
	void sub(int a,int b) {
		int s = a-b;
		System.out.println("sum of two number " +s);
	}	
	
	void sub(int a,int b,int c) {
		int s = a-b+c;
		System.out.println("sum of three number " +s);
	}
	
}


public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculater c = new Calculater();
		c.sum(5,6);
		c.sum(20,30,40);
		c.sub(30,20);
		c.sub(10,5,2);
	}

}
