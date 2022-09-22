package com.InDemo;

public class FinalDemo {

	final int x; //blank final variable
	
	/*FinalDemo()
	{
		x=45;
	}*/
	FinalDemo(int x)
	{
		this.x=x;
	}
	void put()
	{
		//x=20; //if variable is declared as final then can't change value of that variable
	}
	void show()
	{
		System.out.println("x ="+x);
	}
	
	public static void main(String[] args) {
		//FinalDemo d=new FinalDemo();
		FinalDemo d=new FinalDemo(465);
		d.show();

	}

}
