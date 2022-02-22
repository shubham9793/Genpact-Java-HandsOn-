package com.org.gen.day5;

interface A2 {
	void add(int x,int y);
}

class Addition {
	public void sum(int a,int b) {
		int c = a+b;
		System.out.println("Addition "+c);
	}
}

public class TestInstanceMethodRefrence {

	public static void main(String[] args) {
		
		
		A2 d = (a,b)->System.out.println("lambda Result ->"+(a+b));
		d.add(50, 60);
		
		
		Addition a2 = new Addition();
		A2 a1 = a2::sum;
		a1.add(5,7);

	}

}
