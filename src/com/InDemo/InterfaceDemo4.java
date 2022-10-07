package com.InDemo;

@FunctionalInterface
interface Movable1
{
	void move();
	
	public int hashCode();
}
interface Drawable extends Movable1
{
	void stop();
}
class Car5 implements Drawable
{
	public void move()
	{
		System.out.println("Car is moving...");
	}
	public void stop()
	{
		System.out.println("Car is stop...");
	}
}

public class InterfaceDemo4 {

	public static void main(String[] args) {
		Car5 c=new Car5();
		c.move();
		c.stop();

	}

}
