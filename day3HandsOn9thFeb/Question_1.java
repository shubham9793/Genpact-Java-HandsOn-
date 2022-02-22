package com.org.gen.day3HandsOn9thFeb;



/*
 * 
 * Question 1
Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method
 with the same name 'message' that prints "This is first subclass" and "This is second subclass"
  respectively. Call the methods 'message' by creating an object for each subclass.

 * */



abstract class Parent{

	  void message() { }

}

class subClass1 extends Parent{
	void message() {
		System.out.println("I am first subClass message");
	}
}
class SubClass2 extends Parent {
	void message() {
		System.out.println("I am Second subClass message");
	}
}


public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		subClass1 s1 = new subClass1();
		SubClass2 s2 = new SubClass2();
		s1.message();
		s2.message();
	}
	

}
