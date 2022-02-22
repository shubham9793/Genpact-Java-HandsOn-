package com.org.gen.day5;



public class multipleCatcheBlock {
	
	static String s = "Exception Class";
	
	static int a[] = {0,1,2,3,4,5};
	static int ans;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//int arr[] = new int [7];
			s = null;
			//int slength = s.length();
			//System.out.println("Lenght "+s.length());
			
			
			int b = 6;
			System.out.println(a[b]+ans);
			System.out.println("Last statement of try block");
		} catch(ArithmeticException e){
			System.out.println("You should not divde a number by zero");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Access Array element accessing outside of limit");
		}catch(NullPointerException e) {
			System.out.println("Exception caught");
		}catch(Exception e) {
			System.out.println("Other Exception ");
		}

		System.out.println("Out of try block "+ans);
		
	}

}
