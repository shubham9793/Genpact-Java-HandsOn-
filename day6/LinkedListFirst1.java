package com.org.gen.day6;

import java.util.LinkedList;

public class LinkedListFirst1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Java");
		list.add("J2ee");
		list.add("jsp");
		list.add("Servlets");
		list.add("jdbc");
		
		System.out.println(list);
		
		String s = "jsp";
		
		boolean contains = list.contains(s);
		
		
		if(contains) {
			System.out.println(list.indexOf(s));
		}
		
		s = "struts";
		
		contains = list.contains("struts");
		
		if(contains) {
			System.out.println(list.indexOf(s));
		}
		else {
			System.out.println("Not Present 'Struts' ");
		}
		
	}

}
