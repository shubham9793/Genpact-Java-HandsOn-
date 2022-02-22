package com.org.gen.day1;



public class ForEachLoop {
	public static void main(String[] args) {
		String cities [] = {"Dhanbad","Mumba","Delhi","Varanasi"};
	
		for(String c : cities) {
			System.out.println(c);
		}
		int x = 0;
		
		int sum[] = {1,2,3,4,5};
		for(int i : sum) {
			x+=i;
			if(i == 2) 
				break;
		}
		System.out.println(x);
	}
}
