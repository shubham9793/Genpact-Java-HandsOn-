package com.org.gen.day5;


@FunctionalInterface
interface A1 {
	public boolean checksingleDigit(int x);
}

class Digit{
	public static boolean IssingleDigit(int x) {
		return x>-10 && x<10;
		
	}
}


public class TestStaticMethodRef  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a1 = (x)->{return x>-10  && x<10;};
		System.out.println(a1.checksingleDigit(1001));
		
		A1 a2 = Digit :: IssingleDigit;
		System.out.println(a2.checksingleDigit(9));
	}

}
