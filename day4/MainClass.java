package com.org.gen.day4;

interface Onresult{
	void ownSucc(double a);
	void onErr(Exception e);
}

class Divide implements Onresult{

	Onresult onresult;
	
	double a,b;
	public Divide(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	void doDiv() {
		if(b ==0) {
			onresult.onErr(new Exception ("Divid by zero"));
			return ;
		}
		onresult.ownSucc(a/b);
	}
	
	
	void setOnresult(Onresult onresult) {
		this.onresult = onresult;
	}

	@Override
	public void ownSucc(double a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onErr(Exception e) {
		// TODO Auto-generated method stub
		
	}

	
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Divide d = new Divide(3,8);
		
		
		d.setOnresult(new Onresult () {
			@Override
			public void ownSucc(double a) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onErr(Exception e) {
				// TODO Auto-generated method stub
				
			}
		});

	}

}
