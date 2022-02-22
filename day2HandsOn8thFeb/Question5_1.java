package com.org.gen.day2HandsOn8thFeb;



/*
 * Q5) Create a class with name Flipkart 
Its having data members like item, price, discount;
Its also having methods which displays the review about the items and 
also have another method which display the item by its catagorised 
eg:
Items: pen, book, file, tea, beans, cumin;
Output:
Categories1 
 Item name1
Reviews1-
Reviews2-
 Item name2
Reviews1-
Reviews2-
Categories2
 Item name1
Reviews1-
Reviews2
 * 
 * 
 * */


public class Question5_1 {
	String item;
	int price;
	int discount;
	Review review;
	Question5_1(String item,int price,int discount,Review review)
	{
		this.discount=discount;
		this.price=price;
		this.item=item;
		this.review=review;
	}
	void display()
	{
		System.out.println(this.item + " price is " + this.price + " and have dicount of rupee " + this.discount);
		System.out.println("the "+ item + " is very good ");
		System.out.println("the "+ item + " is very cost effective");
	}

	public static void main(String[] args) {
		Review rv=new Review("pen");
		Review rv1=new Review("book");
		Review rv2=new Review("laptop");
		Question5_1 fb=new Question5_1("pen",20,5,rv);
        
		Question5_1 fb1=new Question5_1("book",200,50,rv1);
        
		Question5_1 fb3=new Question5_1("laptop",20000,5000,rv2);
        fb.display();
        fb1.display();
        fb3.display();
	}

}