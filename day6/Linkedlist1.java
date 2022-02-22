package com.org.gen.day6;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Product> link = new LinkedList<>();
		Product p1 = new Product (1,"laptop","Electronic",20);
		Product p2 = new Product (22,"Bike","Vehical",30);
		Product p3 = new Product (32,"TV","Electronic",10);
		Product p4 = new Product (55,"abc","dknkdm",63);
		Product p5 = new Product (32,"acv","jndj",56);
		
		
		link.add(p1);
		link.add(p2);
		link.add(p3);
		link.add(p4);
		link.add(p5);
		
		
		for(Product p : link) {
			System.out.println("product id => "+p.id);
			System.out.println("product name => "+p.pname);
			System.out.println("product type  => "+p.ptype);
			System.out.println("product quantity  => "+p.quntity);
			

			System.out.println("\n");
		}
		

	}

}
