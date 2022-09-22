package com.Pillers;

public class MyEmp {

	static int x=0;
	
	MyEmp()
	{
		x++;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		MyEmp e=new MyEmp();
		MyEmp e1=new MyEmp();
		MyEmp e2=new MyEmp();

	}

}
