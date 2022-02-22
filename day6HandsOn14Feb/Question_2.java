
/*
 * 
 *Q 2) Write a java program declare the string array with the cricketer 
name with the skill set eg: {MS.Dhoni Batsman, Malinga Bowler….} 
and print the count of Batsman, Bowler, Fielder out of 11 players
 * 
 * */


package com.org.gen.day6HandsOn14Feb;

import java.util.HashMap;
import java.util.Map;

public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// first Method
		
		String[] Crick = "Virat=Batsman;MS Dhoni=Allrounder; Rohit=Batsman;Hardik=Allrounder;Jaspret=Bollower;Chahal= Bollower;Shardul=Allrounder;Bhuvneshwar=Bollower;Sachin=Batsman;Kuldeep=Bollower;Kl Rahul=Batsman".split(";");
		
		for(int i=0;i<Crick.length;i++) {
			System.out.println(Crick[i]);
			System.out.println("\n");
				
		}
		
		Map<String, String> map = new HashMap<>();
		map.put("Virat","Batsman");
		map.put("MS Dhoni","Allrounder");
		map.put("Rohit","Batsman");
		map.put("Hardik","Allrounder");
		map.put("Jaspret","Bollower");
		map.put("Chahal","Bollower");
		map.put("Shardul","Allrounder");
		map.put("Bhuvneshwar","Batsman");
		map.put("Kuldeep","Bollower");
		map.put("Kl Rahul","Batsman");
		map.put("Rishbh","Batsman");
	
		
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		
		for(String value : map.values()){
			
			if(value.contains("Batsman")) {
				cnt1++;
			}
			else if(value.contains("Bollower")) {
				cnt2++;
			}
			else {
				cnt3++;
			}
				
		}
		System.out.println("Number of Batsman is "+cnt1);
		System.out.println("Number of Bollower is "+cnt2);
		System.out.println("Number of Allrounder is "+cnt3);
		System.out.println("Total 11 Player in a team "); 
		
		
		
		// Second Method 
		
		 int i;
		   int count=0,count1=0,count2=0;
	       String[] Cricketers = {" MS Dhoni:Batsman " , " Malinga:Bowler " , "Virat:Batsman" ," Rohit:Bowler " ,"Ganguli:Fielder","Sehwag:Batsman" ,"Harbajan:Fielder","Harman:Bowler", "Parneet:Batsman" , "Kartik:Fielder"};
	       for(i=0 ; i<Cricketers.length ; i++) {
	    	   if(Cricketers[i].contains("Batsman"))
	    		   count++;
	    	   else if(Cricketers[i].contains("Bowler"))
	    		   count1++;
	    	   else 
	    		   count2++;
	       }
	       System.out.println("Counts of Batsman -> " +count);
	       System.out.println("Counts of Bowler -> "  +count1);
	       System.out.println("Counts of Fielder -> " +count2);
		
		
	}

}
