package com.org.gen.day1HandsOn7thfeb;

/*write a java program that is menu based selection for hotel to order the 
South indian dish, North indian Dish, Rajasthani Dish, Gujrati Dish, Bengali Dish 
and Deserts with price of each dish and find the total sum and apply a bonus 
desert if bill value is above Rs.500. */


//

 

import java.util.Scanner;
public class Question1 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the Banarasi Hotel");
		System.out.println();
		
		System.out.println("Press 1 for South Indian Dish");
		System.out.println("Press 2 for North Indian Dish");
		System.out.println("Press 3 for Rajasthani Dish");
		System.out.println("Press 4 for Gujrati Dish");
		System.out.println("Press 5 for Bengali Dish");
		System.out.println("Press 6 for Desserts");
		System.out.println("To Exit, Press 0");
		
		while(true){
			

			System.out.println();
			System.out.println("Enter your choice::");
			int choice = sc.nextInt();

			switch(choice){
			case 1: 
				System.out.println("Welcome to South Indian Food");
				southIndianFood();
				break;
			case 2: 
				System.out.println("Welcome to North Indian Food");
				northIndianFood();
				break;
			case 3: 
				System.out.println("Welcome to Rajasthani Food ");
				rajasthaniFood();
				break;
			case 4: 
				System.out.println("Welcome to Gujrati Food");
				gujratiFood();
				break;
			case 5: 
				System.out.println("Welcome to Bengali Food");
				bengaliFood();
				break;			
			case 6: 
				System.out.println("Welcome to Desserts Food");
				desserts();
				break;
			case 0: 
				System.out.println("Thanks for Visit");
				System.exit(0);
				break;
			default: 
				System.out.println("Incorrect input!!! Please re-enter choice from our menu");
			}
		}

	}

	public static void southIndianFood(){
		System.out.println("Idli ");
		System.out.println("Butter ");
		System.out.println("Vada ");

	}

	public static void northIndianFood(){
		System.out.println("Chole Bhature");
		System.out.println("Litti Chokha");
	}

	public static void rajasthaniFood(){
		System.out.println("Dal Baati Churma");
		System.out.println("Laal maas");
		System.out.println("Methi Bajra puri");

	}

	public static void gujratiFood(){
		System.out.println("Dhokla ");
		System.out.println("Khandvi");
		System.out.println("Methi ka Thepla");
	}

	public static void bengaliFood(){
		System.out.println("Dal Bhaat");
		System.out.println("Maach Bhaat");
		System.out.println("Aalu Luchi");
	}

	public static void desserts(){
		System.out.println("Rasmalai");
		System.out.println("Rasgulla");
		System.out.println("Emarti");
	}
		 
}
