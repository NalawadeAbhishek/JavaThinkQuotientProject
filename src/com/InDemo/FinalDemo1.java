package com.InDemo;

public class FinalDemo1 {

	static final int x;
	static final int y;
	
	static
	{
		x=78;
		y=25;
	}
	void show()
	{
		System.out.println("x ="+x+" y ="+y);
	}
	
	public static void main(String[] args) {
		FinalDemo1 f=new FinalDemo1();
		f.show();

	}

}
