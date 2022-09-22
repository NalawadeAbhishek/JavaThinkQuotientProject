package com.InDemo;

abstract class Mobile2
{
	int x;
	public abstract void ringing();
	
	Mobile2(String str)
	{
		System.out.println("Mobile ="+str);
	}
}
class Apple2 extends Mobile2
{
	Apple2()
	{
		super("vivo");
	}
	public void ringing()
	{
		x=12;
		System.out.println("Apple is ringing");
	}
}

public class AbstractDemo2 {

	public static void main(String[] args) {
		Apple2 a=new Apple2();
		a.ringing();
		System.out.println(a.x);
	}

}
