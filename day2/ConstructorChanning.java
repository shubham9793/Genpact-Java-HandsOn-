package com.org.gen.day2;

class Date {
	String name;
	int roll;
	int marks;
	
	public Date(int roll) {
		super();
		this.roll = roll;
		// TODO Auto-generated constructor stub
		System.out.println("roll " + roll);
	}
	
	
	public Date(String name,int roll,int marks) {
		super();
		this.name = name;
		this.roll = roll;
		this.marks = marks;
		// TODO Auto-generated constructor stub
	}
	
	
	void Display() {
		System.out.println(" name " + name);
		System.out.println("roll " + roll);
		System.out.println("marks " + marks);
		
		System.out.println();
	}
	
}


public class ConstructorChanning  extends Date{

	public ConstructorChanning() {
		
		super("shubham",101,522);
		
		// TODO Auto-generated constructor stub
	}
	
	
	public ConstructorChanning(int x) {
		super(5);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorChanning c1 = new ConstructorChanning();
		c1.Display();
		
		ConstructorChanning c2 = new ConstructorChanning();
		c2.Display();
	}

	

}
