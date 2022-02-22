package com.org.gen.day4;

interface TexPrint {
	void sample(String tex);
}




class Callback implements TexPrint {

	@Override
	public void sample(String tex) {
		// TODO Auto-generated method stub
		System.out.println("tex is -> "+tex);
	}
	
}




public class ClassA {
	TexPrint text1 ;
	

	public ClassA(TexPrint text1) {
		super();
		this.text1 = text1;
	}
	
	public  void sample2(String s) {
		text1.sample(s);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Callback obj = new Callback();
		ClassA obj1 = new ClassA(obj);
		obj1.sample2("Callback Program is running ");
	}

}
