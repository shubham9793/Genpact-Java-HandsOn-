package com.org.gen.day1HandsOn7thfeb;

//wap to initial letter of a string as a pattern

//my name is shubham so i'm  printing s pattern


public class Question4 {
	public static void main(String [] args) {
		for(int row=1;row<=11;row++) {
			
			for(int col=1;col<=11;col++) {
				
				if(row  == 1  || row == 11/2 || row == 11) {
					if(col %2 == 0)
						System.out.print("*");
					else 
						System.out.print(" ");
				}
				else if(row < 11/2 && col == 1)
					System.out.print("*");
				else if(row > 11/2 && col == 11)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}
