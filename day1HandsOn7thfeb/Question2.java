package com.org.gen.day1HandsOn7thfeb;

// ATM 

import java.util.Scanner;
public class Question2 {
	public static void main(String[] args) {
		
		final short orgpin = 7204;
		short userpin = -1;
		short incurpin = 0;
		long curbalance = 50000;
		long deposit = 0;
		int choice=-1;
		
		long withamt;
		boolean invailidamt = false;
		Scanner sc = new Scanner(System.in);
		
		//set pin code
		
		do {
			System.out.println("Enter your pin code") ;
			userpin = sc.nextShort();
			if(userpin != orgpin) {
				incurpin++;
			}
			
		}while(userpin != orgpin  && incurpin < 3 && userpin != -1);
		if(userpin  == -1) {
			System.out.println("Thank You!");
		}
		else {
			if(incurpin >= 3 ) {
				System.out.println("You enter 3 time incurrect pin! program will Stop");
			}
		}
		
		
		// switch Case
		
		
		
		do {
			System.out.println("Select Your Choice");
			System.out.println();
			System.out.println("Press 1 for Check Balance");
			System.out.println("Press 2 for cash WithDraw");
			System.out.println("Press 3 for Deposit cash ");
			System.out.println("To Exit, Press 0");
		
			choice = sc.nextInt();
		
		
		
			switch(choice) {
			case 1:
				System.out.println("Your Current Balance is "+ curbalance);
				break;
				
			case 2:
				System.out.println("Enter Withdraw amount that you want");
				withamt = sc.nextLong();
				if(withamt > curbalance ) {
					System.out.println("influence Balance");
				}
				
				curbalance -= withamt; 
				break;
				
			case 3:
				do {
					invailidamt = false;
					System.out.println("Please enter amount which you want to deposit in you account ");
					System.out.println();
					deposit = sc.nextLong();
					
					if(deposit < 0) 
						invailidamt = true;
					else {
						if(deposit % 10 != 0) 
							invailidamt = true;
					}
					if(invailidamt) 
						System.out.println("Enter a valid Amount ");
					
				} while(invailidamt);
			
				curbalance += deposit;
			
				break;
			default:
				System.out.println("Enter a valid Choice ");
			}
		}while(choice != 6 );
	}

}
