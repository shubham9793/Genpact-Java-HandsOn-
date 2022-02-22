package com.org.gen.day4;


interface Comp{
	int fun(int a,int b);
}

public class LambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comp c = (a,b)->{if(a>b) return a; else  return b;};
		System.out.println(c.fun(2,3));
	}
	
}
