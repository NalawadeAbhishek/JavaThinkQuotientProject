package com.Pillers;

public class Arithematic {

	public void operator(int x,float y)
	{
		System.out.println("Addition is ="+(x+y));
	}
	public void operator(float x,int y)
	{
		System.out.println("Substraction is ="+(x-y));
	}
	public void operator(int x,float y,int z)
	{
		System.out.println("Multiplication is ="+(x*y*z));
	}
	public void operator(int x,int z)
	{
		System.out.println("Division is ="+(x/z));
	}
	
	
	public static void main(String[] args) {
		Arithematic d=new Arithematic();
		d.operator(4,12.2f);
		d.operator(25.68f,18);
		d.operator(7,2.58f,4);
		d.operator(75,5);

	}

}
