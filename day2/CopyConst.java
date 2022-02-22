package com.org.gen.day2;

public class CopyConst {
	//step 1
		int a= 10;
		int b=20;
		
		CopyConst() {
			System.out.println("Default Number Constructor");
		}
		
    // step 2
		CopyConst(CopyConst n) {
			a = n.a;
			b = n.b;
		}
		
		public static void main(String[] args) {
			
	//Step 3'
			CopyConst n = new CopyConst();
			System.out.println("Number A is "+ n.a);
			System.out.println("Number B is "+ n.b);
	// Step 4:		
			n.a = 50;
			n.b = 60;
			System.out.println("update the value of A and B in existing objects");
			
			System.out.println("Number A is "+ n.a);
			System.out.println("Number B is "+ n.b);
			
	//step 5:
			
			System.out.println("update the value of A and B in existing objects");
			CopyConst n2 = new CopyConst();
			System.out.println("Number A is "+ n2.a);
			System.out.println("Number B is "+ n2.b);
			
			
	// step 6
			
			System.out.println("update the value of A and B in existing objects");
			CopyConst n3 = new CopyConst(n);
			System.out.println("Number A is "+ n3.a);
			System.out.println("Number B is "+ n3.b);
	}
}
