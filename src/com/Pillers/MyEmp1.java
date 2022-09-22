package com.Pillers;

public class MyEmp1 {

	static int x=20;
	int y=30;
	
	public void put()
	{
		System.out.println(x+" "+y);
		x=45;
	}
	public static void show()
	{
		MyEmp1 m=new MyEmp1();
		System.out.println(x+" "+m.y);
	}
	
	public static void main(String[] args) {
		new MyEmp1().put();
		MyEmp1.show();

	}

}
