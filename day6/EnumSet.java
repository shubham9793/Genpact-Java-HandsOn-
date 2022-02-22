package com.org.gen.day6;


enum Weekdays {
	Monday,Tuesday,Wednesday,Tharsday,Friday,Saturday,Sunday
}

enum Size {
	Small,Xsmall,Medium,Larg,ExtraLarge
}


class Test{
	Size PizzaSize;

	public Test(Size PizzaSize) {
		super();
		// TODO Auto-generated constructor stub
		this.PizzaSize = PizzaSize;
	}
	
	public void order() {
		switch (PizzaSize) {
		case Small:
			System.out.println("Small Size Pizza");
			break;
		case Medium:
			System.out.println("Medium Size Pizza");
			break;
			default:
				throw new IllegalArgumentException("Not available "+PizzaSize);
		}
			
	}
	
}
public class EnumSet {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println(Size.ExtraLarge);
		System.out.println(Weekdays.Wednesday);
		
		Test t1 = new Test(Size.Medium);
		t1.order();
		
		

	}

}
