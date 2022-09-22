package com.InDemo;

abstract class Mobile
{
	public abstract void ringing();
}
class Apple extends Mobile
{
	public void ringing()
	{
		System.out.println("Apple is ringing");
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		Apple a=new Apple();
		a.ringing();
				

	}

}
