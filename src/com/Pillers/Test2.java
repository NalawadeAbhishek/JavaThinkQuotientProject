package com.Pillers;

public class Test2 {

	static int x;
	static int y=25;
	public static void accept(int x)
	{
		Test2.x=x;
		
	}
	public void show()
	{
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		accept(10);
		new Test2().show();
		
	}

}
