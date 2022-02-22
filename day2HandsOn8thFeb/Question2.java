package com.org.gen.day2HandsOn8thFeb;

/*
 * 
 * 
 * Question 2
Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class.
 The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively.
  Now, assign name, age, phone number, address and salary to an employee and a manager by
   making an object of both of these classes and print the same.

 * */


class Member {
	String name;
	int age;
	long phoneNo;
	String address;
	long salary;
	
	
	void printSalary(int salary) {
		System.out.println("salary is "+ salary);
	}
	
	
	public Member(String name, int age, long phoneNo, String address) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	
	void display() {
		System.out.println("Name is "+ name);
		System.out.println("Age is "+ age);
		System.out.println("Phone Number is "+ phoneNo);
		System.out.println("Address is "+ address);
		
	}
	
}

class Employee extends Member {
	
	String specialization;
	String department;
	
	public Employee(String name, int age, long phoneNo, String address,String specialization, String department) {
		super(name, age, phoneNo, address);
		this.specialization = specialization;
		this.department = department;
		// TODO Auto-generated constructor stub

		System.out.println("Employess specialization is  "+ specialization);
		System.out.println("Department of Employee  is "+ department);
	}
}


class Manager extends Member {
	String specialization;
	String department;

	public Manager(String name, int age, long phoneNo, String address,String specialization, String department) {
		super(name, age, phoneNo, address);
		this.specialization = specialization;
		this.department = department;
		// TODO Auto-generated constructor stub
		
		
		System.out.println("Manger specialization is  "+ specialization);
		System.out.println("Department of Manager  is "+ department);
	}

		
}


public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee("shubham",22,12345678,"Varanasi","Java Developers","IT Department");
		e1.printSalary(70000);
		e1.display();
		

		Manager m1 = new Manager("xyz",35,152252115,"Mumbai","Cpp Developers","IT Department");
		m1.printSalary(170000);
		m1.display();
		
		
		

	}

}

