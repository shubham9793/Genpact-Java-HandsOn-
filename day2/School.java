package com.org.gen.day2;

public class School {
	String scName;
	int year ;
	
	public School(String name ) {
		scName = name;
	}
 	
	public School() {
		scName="sss";
		year = 2013;
		
	}

	
	
	public School(String scName, int year) {
		super();
		this.scName = scName;
		this.year = year;
	}


	void Display() {
		System.out.println("School name " + scName);
		System.out.println("Year " + year);
		
		System.out.println();
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School s1 = new School();
		s1.Display();
		
		School s2 = new School("GIC",2001);
		s2.Display();
		
		School s3 = new School("Shani Shiksha");
		s3.Display();
		
	
	}

}
