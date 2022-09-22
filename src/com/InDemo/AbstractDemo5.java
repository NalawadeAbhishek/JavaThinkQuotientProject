package com.InDemo;

abstract class Vehicle
{
	String vmodel="45435";
	public abstract void cname();
	
	public void vcolor()
	{
		System.out.println("White");
	}
}
class Car1 extends Vehicle
{
	public void cname()
	{
		super.vcolor();
		System.out.println("XUV700");
		System.out.println("vmodel ="+super.vmodel);
	}
}

public class AbstractDemo5 {

	public static void main(String[] args) {
		Car1 c=new Car1();
		c.cname();
		
	}

}
