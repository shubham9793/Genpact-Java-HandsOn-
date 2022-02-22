package com.org.gen.day2;


class BaseClass {
	void features () {
		System.out.println("A");
		System.out.println("B");
		
	}
}


class DerivedClass extends BaseClass {
	void OwnFeatures() {

		System.out.println("c");
	}
}
public class InhritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DerivedClass d1 = new DerivedClass() ;
		d1.OwnFeatures();
		d1.features();
				
	}

}
