package com.org.gen.day6HandsOn14Feb;

import java.util.Iterator;
import java.util.TreeSet;


class Book implements Comparable<Book>{

	int id;
	String name,publisher;
	int quantity,subscriber;


	public Book(int id, String name, String publisher, int quantity, int subscriber) {
		super();
		this.id = id;
		this.name = name;
		this.publisher = publisher;
		this.quantity = quantity;
		this.subscriber = subscriber;
	}

    @Override
	public int compareTo(Book o) {
		if(subscriber > o.subscriber)
			return 1;
		else if(subscriber < o.subscriber)
			return -1;
		else
			return 0;		
	}
	
}
class TreeSetOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeSet<Book> tree = new TreeSet<>();
		
		 
		Book b1 = new Book(111, "CoreJava", "Yashavant", 2, 2);
		Book b2 = new Book(112, "JavaAdvance", "MC Graw", 5, 6);
		Book b3 = new Book(113, "Spring", "Galvin", 5, 7);
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		
	   System.out.println(" Head Set"); 
	    TreeSet<Book> head_set = (TreeSet<Book>)tree.headSet(b3);
	    Iterator it= head_set.iterator();
	 
	   while(it.hasNext()){
			Book b = (Book)it.next();
			System.out.println(" id :: "+b.id+" name:: "+b.name+"   publisher::  "+b.publisher +"  subscriber::  "+ b.subscriber +"  quantity:: "+b.quantity);
		}
	        
	   System.out.println(" Tail Set");    
	   TreeSet<Book> tail_set = (TreeSet<Book>)tree.tailSet(b2); 
       Iterator itr= tail_set.iterator();
        
	    while(itr.hasNext()){
			Book b = (Book)itr.next();
			System.out.println(" id :: "+b.id+" name:: "+b.name+"   publisher::  "+b.publisher +"  subscriber::  "+ b.subscriber +"  quantity:: "+b.quantity);
		} 
	       
	    
	    System.out.println(" SubSet");
	    System.out.println(" subset of the given tree ::" );
	    TreeSet<Book> subBook= (TreeSet<Book>)tree.subSet(b1, b2);
	    Iterator itSubBook= subBook.iterator();
        
	    while(itSubBook.hasNext()){
			Book b = (Book)itSubBook.next();
			System.out.println(" id : "+b.id+" name : "+b.name+"   publisher :  "+b.publisher +"  subscriber :  "+ b.subscriber +"  quantity : "+b.quantity);
		} 
	    
	    
		int sub=0;
		String name="";
		for(Book b: tree){
			if(b.subscriber>sub) {
				sub=b.subscriber;
				name=b.name;
			}
		}
		
		System.out.println("Maximum subscriber of the book is "+sub +" \n and the name of the book is "+name);
	}

}