package com.org.gen.day2HandsOn8thFeb;

/*
 * Q1) Create a following classes with the methods
MyProtein Class - having main method
Proteins which defines the benefits of protein and also define display 
method with default constructor
Then create a Sources class which defines the sources of protein and 
extends the Proteins Class
And then call all the method using a single object in MyProtein class;
 * 
 * */


 class Protine {
	String A;
	String B;
	String C;
	
	Protine() {
		super();
		System.out.println("Default Protine class helps to create your body");
	}
	
	Protine(String A,String B,String C) {
		super();
		this.A = A;
		this.B = B;
		this.C = C;
	}
	
	
	void Display() {
		System.out.println("Protine A=> "+A);
		System.out.println("Protine B=> "+B);
		System.out.println("Protine C=> "+C);
		
	}
}

class Source extends Protine {
	Source() {
		System.out.println("this is default source of protine class");
	}
	
	Source(String A,String B,String C) {
		super("A","B","C");
			
		}
	
}



public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source s1 = new Source();
		
		Source s2 = new Source("A","B","C");
		s2.Display();
	}

}


