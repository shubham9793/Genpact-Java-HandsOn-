package com.org.gen.day6Test;



import java.util.Scanner;

class WeightLimitExceeded extends Exception{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	WeightLimitExceeded(int x){
        System.out.print((15-x)+" KG more than maximum value ");
    }
}



class TestAssignment___5 {
	
    void WeightAllowed(int w) throws WeightLimitExceeded{
        if(w>15)
            throw new WeightLimitExceeded(w);
        else
            System.out.println("You are Allowed- to carry your luggage ");
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	
    	TestAssignment___5 a=new TestAssignment___5();
    	System.out.println("Enter your luggage weight ");
    	
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<2;i++){
        	
            try{
                a.WeightAllowed(sc.nextInt());
            }catch(WeightLimitExceeded e){
                System.out.println(e);
            }
        }
        
	}
}