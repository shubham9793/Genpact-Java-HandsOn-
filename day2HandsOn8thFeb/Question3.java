package com.org.gen.day2HandsOn8thFeb;

/*
 * 
 * Question 3 
Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods
 to print the area and perimeter of the rectangle respectively. Its constructor having 
 parameters for length and breadth is used to initialize length and breadth of the rectangle. 
 Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its 
 side (suppose s) calling the constructor of its parent class as 'super(s,s)'. Print the area and perimeter 
 of a rectangle and a square.

 * */



class Rectangle {
	int length;
	int breadth;
	
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
		System.out.println("Rectangle \n");
	}
	void area() {
		int x = length*breadth;
		
		System.out.println("area is "+x);
		
	}
	void perimeter () {
		int x = 2*(length+breadth);
		System.out.println("perimeter is "+x);
		
	}
}


class Square extends Rectangle {

	public Square(int length) {
		super(length,length);
		System.out.println("Square ");
		// TODO Auto-generated constructor stub
	}
	
}



public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(10,20);
		r.area();
		r.perimeter();
		
		
		Square s = new Square(10);
		s.area();
		s.perimeter();

	}

}

