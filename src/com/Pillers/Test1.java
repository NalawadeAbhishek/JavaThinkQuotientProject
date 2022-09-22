package com.Pillers;

public class Test1 {
	
	static
	{
		System.out.println("Block1");
	}
	Test1()
	{
		System.out.println("Instance Block1");
	}
	public static void display()
	{
		System.out.println("He");
	}
	
	public static void main(String []args)
	{
		System.out.println("Main");
		Test1 t=new Test1();
		//Test1 t1=new Test1();
	}
	static
	{
		System.out.println("Block2");
	}
	
}
