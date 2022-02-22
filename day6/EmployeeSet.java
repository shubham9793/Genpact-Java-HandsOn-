package com.org.gen.day6;


class NewEmployee{
	String name;
	int id;
	
	public NewEmployee(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	int salary;
}

class OldEmployee{
	String name;
	int id;
	int salary;
	
	public OldEmployee(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
}


public class EmployeeSet {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		NewEmployee newEmp = new NewEmployee ("shubham",5,10000);
		
		OldEmployee oldEmp = new OldEmployee ("SAHoo",10,5000);
		
		

	}

}
