package com.org.gen.day3;

// nishi.verma10@gmail.com

class MotherBoard{
	String model;
	
	public MotherBoard(String model) {
		super();
		this.model = model;
	}

	static class USB{
		int usb2 = 2;
		int usb3 = 1;
		int gettotalport() {
			return usb2+usb3;
		}
	}
}

public class StaticInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotherBoard.USB usb = new MotherBoard.USB();
		System.out.println("Total Port = "+usb.gettotalport());
	}

}
