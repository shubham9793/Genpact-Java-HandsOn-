package com.org.gen.day1HandsOn7thfeb;

//wap to reverse of this pattern down word piramid  

//Print star pattern using for loop


import java.util.Scanner;
public class Question5 {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number ");
			int n = sc.nextInt();
			
			for(int i=n;i>=0;i--) {
				for(int j=1;j<=i;j++) {
					System.out.print(" *");
				}
				System.out.println();
			}
			
			
		}
}











/*package com.org.gen.day1;
import java.util.Scanner;
public class LoopState {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number ");
			int n = sc.nextInt();
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(" *");
				}
				System.out.println();
			}
			
			
		}
}
*/

