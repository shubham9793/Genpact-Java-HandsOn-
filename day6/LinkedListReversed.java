package com.org.gen.day6;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListReversed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String> ();
		list.add("Java");
		list.add("J2ee");
		list.add("jsp");
		list.add("Servlets");
		list.add("jdbc");
		
		Iterator<String> it= list.descendingIterator();
		
		int size = list.size();
		System.out.println("length of list is "+size);
		
		String [] name = new String[size];
		name = list.toArray(name);
		
		System.out.println(name);
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
