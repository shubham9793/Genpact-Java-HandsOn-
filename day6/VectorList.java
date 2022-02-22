package com.org.gen.day6;

import java.util.Iterator;
import java.util.Vector;

public class VectorList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<>();
		v.add("Dog");
		v.add("Cat");
		v.add("Mouse");
		v.add("Cow");
		
		Vector<String> v1 = new Vector<>();
		v.addAll(1,v1);
		
		System.out.println("complete data "+v);
		System.out.println("2nd data "+v.get(2));
		
		Iterator<String> itr = v.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next());
			System.out.print(" ");
		}
	}

}
