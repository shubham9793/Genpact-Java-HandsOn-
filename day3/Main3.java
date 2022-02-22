package com.org.gen.day3;


abstract class Employee {
	private String Ename ;
	private int id;
	
	public Employee(String Ename, int id) {
		super();
		this.Ename = Ename;
		this.id = id;
	}
	void m1() {
		System.out.println("Name is " +Ename);
		System.out.println("id is " +id);
	}
	
}



class Engineer extends Employee {

	public Engineer(String Ename, int id) {
		super(Ename, id);
		// TODO Auto-generated constructor stub
	}
}

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engineer e = new Engineer ("Shubham",52252);
		e.m1();
		
	}

}
