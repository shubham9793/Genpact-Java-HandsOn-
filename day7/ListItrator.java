package com.org.gen.day7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListItrator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> number = new ArrayList<>();

		number.add(1);
		
		number.add(3);
		number.add(2);
		
		System.out.println("Array List "+number);
		
		ListIterator<Integer> itr = number.listIterator();
		
		int number1 = itr.next();
		System.out.println("Next Element "+number1);
		
		int index1 = itr.nextIndex();
		System.out.println("Next index1 "+index1);
		
		System.out.println("is there is Next element "+itr.hasNext());
		
		
		
	}
	

}
