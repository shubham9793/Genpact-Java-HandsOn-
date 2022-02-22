package com.org.gen.day4;

class Compaire {
	int id;
	String name;
	public Compaire(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this==obj) return true;
		
		if(obj == null || obj.getClass() != this.getClass()) return false;
		Compaire cc = (Compaire)obj;
		return ((cc.name==this.name && cc.id == this.id));
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		
		return super.hashCode();
	}	
}

public class mainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compaire c1 = new Compaire (1,"1");
		Compaire c2 = new Compaire (1,"1");
		if(c1.hashCode() == c2.hashCode()) {
			System.out.println("Equal");
		}else {
			System.out.println("not Equal");
		}
		

	}

}
