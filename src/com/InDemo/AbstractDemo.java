package com.InDemo;

abstract class Vehicle
{
	String vmodel="45435";
	public abstract void vname();
	
	public void vcolor()
	{
		System.out.println("White");
	}
}
class Car1 extends Vehicle
{
	public void vname()
	{
		super.vcolor();
		System.out.println("XUV700");
		System.out.println("vmodel ="+vmodel);
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		Car1 c=new Car1();
		c.vname();
		
	}

}
