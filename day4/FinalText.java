package com.org.gen.day4;

import java.util.*;
class OneTextClass implements Text{

	@Override
	public int paytext() {
		// TODO Auto-generated method stub
		return 50000;
	}
	
}

class TwoTextClass implements Text{

	@Override
	public int paytext() {
		// TODO Auto-generated method stub
		return 60000;
	}
	
}



class propertyTex implements Text{

	@Override
	public int paytext() {
		// TODO Auto-generated method stub
		return 70000;
	}
	
}


public class FinalText {

	static void countTex(Text t) {
		int tt = 30000;
		int ss = t.paytext();
		int total = ss+tt;
		System.out.println("Totsl Text + "+total);
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text name");
		String tex = sc.nextLine();
		
		Class c1 = Class.forName(tex);
		Text t1 = (Text) c1.newInstance();
		
	}

}
