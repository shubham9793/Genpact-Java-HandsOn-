package com.org.gen.day2HandsOn8thFeb;
/*
 * 
 * Question 1  
Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class



 * */





class Base_ {
	void BaseMethod() {
		System.out.println("This is parent class");
	}
}

class Derived_ extends Base_ {
	void DerivedMethod() {
		System.out.println("This is child class");
	}
}

public class Question1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base_ b1 = new Base_();
		b1.BaseMethod();
		
		Derived_ d1 = new Derived_();
		d1.DerivedMethod();
		
		Derived_ d2 = new Derived_();
		d2.BaseMethod();
	}

}
