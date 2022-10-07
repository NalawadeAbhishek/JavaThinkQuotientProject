package com.InDemo;

interface Drawable1
{
	default void stop()
	{
		System.out.println("Car is stop...");
	}	
}
@FunctionalInterface
interface Movable2 extends Drawable1
{
	void move();
	
	public int hashCode();
}
class Car6 implements Movable2
{
	public void move()
	{
		System.out.println("Car is moving...");
	}
}

public class InterfaceDemo5 {

	public static void main(String[] args) {
		Car6 c=new Car6();
		c.move();
		c.stop();

	}

}
