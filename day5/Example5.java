package com.org.gen.day5;

//interface exa {
//	int methodexa(int i);
//}
//
//class s {
//	int methodexa(int i) {
//		return i =+ i*i;
//	}
//}
//
//class example extends s implements exa {
//
//	
//}
//public class Example5 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		example e = new example();
////		System.out.println(e.methodexa(5));
////		
//		exa a1 = new example();
//		System.out.println(a1.methodexa(5));
//	}
//
//}


interface A
{
    void myMethod();
}
 

class B
{
    public void myMethod()
    {
        System.out.println("My abstruct  Method implements in B class");
    }
}
 
class C1 extends B implements A
{
     
}
 
class Example5
{
    public static void main(String[] args) 
    {
        A a = new C1();
         
        a.myMethod();
    }
}