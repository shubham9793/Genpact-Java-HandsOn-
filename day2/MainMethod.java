// variable Hiding 




package com.org.gen.day2;

class BB {
	String s = "Hi";
	
}

class AA extends BB{
	String s = "Hello";
	void Display() {
		System.out.println(s);
		System.out.println(super.s);
	}
}


public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AA a = new AA();
		a.Display();
		

		BB a1 = new AA();
		System.out.println(a.s);
	}

}
