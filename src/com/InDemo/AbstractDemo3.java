package com.InDemo;

abstract class Vehicle1
{
	public abstract void run();
}
abstract class Car2 extends Vehicle1
{
	public abstract void stop();
}
class BMW extends Car2
{
	public void run()
	{
		System.out.println("BMW running...");
	}
	public void stop()
	{
		System.out.println("BMW stoped...");
	}
}

public class AbstractDemo3 {

	public static void main(String[] args) {
		BMW b=new BMW();
		b.run();
		b.stop();

	}

}
