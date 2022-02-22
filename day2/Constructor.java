package com.org.gen.day2;

class Demo{
	
	public Demo() {
		System.out.println("Demo class Default constructor");
	}
	
	public Demo(int x) {
		this();
		System.out.println("Demo class parameterize constructor "+x);
	}
	
	
	void m1() {
		System.out.println("Hey i am method m1");
	}
	void m2() {
		System.out.println("Hey i am method m2");
		this.m1(); // You can call also like m1()
	}
}






public class Constructor {
	String name;
	int age;
	String add;
	
	// default Constructor 
	public Constructor() {
		super();
		name = "ajay";
		age  = 55;
		// TODO Auto-generated constructor stub
		
	}
	
// parametrized Constructor 

	

	public Constructor(String name, int age, String add) {
		super();
		this.name = name;
		this.age = age;
		this.add = add;
	}
	
	void display() {
		System.out.println(name+" "+age+ " " + " "+add);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c1 = new Constructor(); // default Constructor 
		c1.display();
		
		
		Constructor c2 = new Constructor("shubham",22, "VNS");
		c2.display();
		
		Demo d1 = new Demo();
		Demo d2 = new Demo(5);
		d1.m2();
		

	}

}
