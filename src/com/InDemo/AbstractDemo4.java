package com.InDemo;

abstract class Vehicle2
{
	public abstract void run();
}
abstract class Car3 extends Vehicle2
{
	public abstract void stop();
	
	public void run()
	{
		System.out.println("BMW running...");
	}
}
class BMW1 extends Car3
{
	
	public void stop()
	{
		System.out.println("BMW stoped...");
	}
}

public class AbstractDemo4 {

	public static void main(String[] args) {
		BMW1 b=new BMW1();
		b.run();
		b.stop();

	}

}
