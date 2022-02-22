package com.org.gen.day2HandsOn8thFeb;

/*
 * 
 * Q2) Create a following classes with the methods
Vehicle Class - with following methods (sound(), engine(),setting()).
Car Class which extends Vehicle Class �with following methods 
(colour(), model()).
Honda Class which extends the Car Class �with following methods 
(sound(), engine(),setting()).
Honda City Class which extends the Honda Class. � with following 
methods (HP(), features()).
Then create a class which contains the main function and extends the 
Honda Class and then call all the method using a single object.
 * 
 * */



class Vehicle1 {
	int x;
	Vehicle1(int x) {
		this.x = x;
		System.out.println("Vehical class Constructor "+x);
	}
	
	void sound() {
		System.out.println("Full base sound");
	}
	void engin(int n) {
		System.out.println("engin No is "+n);
	}
	void price(int x) {
		System.out.println("price is "+x);
	}
	void sitting(int x) {
		System.out.println("Type of Sitter "+x);
	}
}



class CarClass1 extends Vehicle1 {
	CarClass1() {
		super( 30);
		System.out.println("Car class Constructor");
	}
	
	void color(String str) {
		System.out.println("Car color is "+str);
		
	}
	void model(String m) {
		System.out.println("model of car is "+m);
	}
}

class Honda extends CarClass1 {
	void CCType(int x) {
		System.out.println("cars cc is "+x);
	}
}

class HondaCity extends Honda{
	void display() {
		System.out.println("Honda city is Fully lassed by all this feature ");
	}
}





public class Question2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HondaCity h1 = new HondaCity();
		
		h1.sound();
		h1.engin(355);
		h1.price(252233);
		h1.sitting(4);
		h1.color("White");
		h1.model("JKL Model");
		h1.CCType(5000);
		h1.display();
		
		
	}
	
	
	
	
}
