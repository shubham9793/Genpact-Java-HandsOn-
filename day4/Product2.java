package com.org.gen.day4;


class Product implements Cloneable {
	private String ptype;
	private String pname;
	
	
	
	
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Product pro  = (Product ) super.clone();
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return "Product[pname ="+ pname+",ptype ="+"]";
	}
	
	
	
	
}

public class Product2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product pro = new Product ();
		pro.setPname("Laptop");
		pro.setPtype("Digital");

	}

}
