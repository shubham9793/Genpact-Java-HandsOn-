package com.org.gen.day4;

public class Person1 implements Cloneable {
	int id = 0;
	String name = null;
	
	public Person1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Person1() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Person1 p = new Person1(1,"AB");
		Person1 p1 = (Person1) p.clone();
		Person1 p2 = new Person1(1,"CD");
		System.out.println("Hashcode for p "+p.hashCode());
		
		System.out.println("Hashcode for p1 "+p1.hashCode());
		
		System.out.println("Hashcode for p2 "+p2.hashCode());

	}

}
