package com.org.gen.day2;

public class Product {

	int pid;
	String pname;
	int price;
	static String comp_nane = "JavaOracal";
	
	public Product(int pid, String pname, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	
void Display() {
	System.out.println("Pi=>"+pid);
	System.out.println("Pname=>"+pname);
	System.out.println("price=>"+price);
	System.out.println("Company Name=>"+comp_nane);
	
}

static void changeCompany() {
	comp_nane = "Chnage_Company_Name";
}
	
	public static void main(String [] args) {
		
		Product p1 = new Product(1,"abc",520);
		Product p2 = new Product(2,"xyz",252);
		Product p3 = new Product(3,"efg",211);
		Product p4 = new Product(4,"hij",511);
		Product p5 = new Product(5,"kjl",563);
		Product.changeCompany();
		p1.Display();
		p2.Display();
		p3.Display();
		p4.Display();
		p5.Display();
		
		
	}
}
