package com.org.gen.day3HandsOn9thFeb;

/*Question 4
An abstract class has a construtor which prints "This is constructor of abstract class", 
an abstract method named 'a_method' and a non-abstract method which prints "This is a normal
 method of abstract class". A class 'SubClass' inherits the abstract class and has a method named
  'a_method' which prints "This is abstract method". Now create an object of 'SubClass' and call 
  the abstract method and the non-abstract method. (Analyse the result)
*/





abstract class Abs{
	Abs() {
		System.out.println("This is constructor of abstruct class");
	}
	abstract void a_method();
	
	public void non_abstract() {
		System.out.println("This is a normal method of abstract class");
	}
}

class Subclass extends Abs {
	

	@Override
	void a_method() {
		System.out.println("This is abstract method");
		// TODO Auto-generated method stub
	}
	
}



public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Subclass s = new Subclass();
		s.a_method();
		s.non_abstract();
	}

}
