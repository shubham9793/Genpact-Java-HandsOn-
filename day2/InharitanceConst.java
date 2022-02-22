package com.org.gen.day2;
// Single level inheritance and Constructor in inheritance  

class Vehicle {
	int x;
	Vehicle(int x) {
		this.x = x;
		System.out.println("Vehical class Constructor "+x);
	}
}

class CarClass extends Vehicle {
	CarClass() {
		super( 30);
		System.out.println("Car class Constructor");
	}
}




public class InharitanceConst {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarClass c1 = new CarClass();
	}
}

	

