package com.org.gen.day5;

interface C {
	public Employee getemployee();
}



interface D {
	public Employee getemployeeinfo(String name,int age);
}




class Employee {

	private String name;
	private int age;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee (String name,int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public void getInfo() {
		System.out.println("I am Class Employee");
		System.out.println("parameter Constructor  name  and ->"+name+ ", age -> " +age);
		
	}
}



public class TestConstructerMethodRefrence {

	public static void main(String[] args) {
		
		// lamda Function 
		
		
		C c=()->new Employee();
		c.getemployee().getInfo();
		
//		D d1 =()->new Employee();
//		d1.getemployeeinfo("Akash" , 25).getinfo();
		
		// TODO Auto-generated method stub
		
		
		
		// abstruct Method
		C c1 = Employee::new;
		c1.getemployee().getInfo();
		
		
		D d = Employee :: new;
		d.getemployeeinfo("Shubham", 50).getInfo();
		
	}

}
