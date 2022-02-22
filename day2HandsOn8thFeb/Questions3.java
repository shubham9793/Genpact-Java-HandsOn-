package com.org.gen.day2HandsOn8thFeb;



/*
*
* Q3) Create a following classes with the methods
 Digital Class - with following methods (power(), memory())
Laptop Class which extends Digital Class �with following methods 
( screenSize(), displayQuality() )
Ipad Class which extends the Digital Class �with following methods 
(color(), model())
Chrome Book Class which extends the Laptop Class. � with following 
methods (noOfKeys())
Then create a class which contains the main function and call all the 
method using object.
* */






class DigitalClass {
	
	void powe(int x) {
		System.out.println(" Batter Power  is "+x  +" MH ");
	}
	void memory(int x) {
		System.out.println(" Memory Size "+x+" "+"GB");
	}
	
}
class Laptop extends DigitalClass {
	Laptop() {
		System.out.println(" Laptops details");
		System.out.println();
	}
	void screenSize(int x) {
		System.out.println(" Laptop Screen Size "+x + " " +" Inches");
	}
	void displayQlt(String x){
		System.out.println(" Laptop Display Quality   " + x+" "+"PXL");
	}
	
}
class Ipad extends DigitalClass {
	Ipad() {
		System.out.println(" Ipads  details");
		System.out.println();
	}
	void color(String c) {
		System.out.println(" Color of Ipad is  "+c);
	}
	
	void model(String m) {
		System.out.println(" Model of Ipad is  "+m);
	}
}

class ChromBook extends Laptop {
	void NoofKey() {
		System.out.println(" No of key is same as the others laptops and insted of Capslock there is Search button");
	}
}


public class Questions3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		ChromBook c1 =  new ChromBook ();
		
		c1.displayQlt("1080");
		c1.powe(10000);
		c1.memory(500);
		c1.screenSize(15);
		c1.NoofKey();
		
		
		
		System.out.println();
		
		
		Ipad i = new Ipad ();
		i.color("White");
		i.powe(5000);
		i.memory(128);
		i.model("Apple S series 101");
		
		
	}

}


