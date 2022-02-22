package com.org.gen.day5;


interface A11 {
	void getName(String name) ;
}



public class MethodRef implements A11 {

	
	static void getinfo(String name) {
		System.out.println(name);
		//System.out.println("This is my methodref class method ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A11 a = (name)->System.out.println(name);
		a.getName("this is my name, shubham");
		
		
		A11 aa = MethodRef::getinfo;
		aa.getName("again this is my name,shubham");
	}
	@Override
	public void getName(String name) {
		// TODO Auto-generated method stub
		
	}

}
