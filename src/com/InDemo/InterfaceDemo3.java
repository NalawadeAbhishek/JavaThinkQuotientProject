package com.InDemo;

interface Movable
{
	void move();
	
	public int hashCode();
}
class Car4 implements Movable
{
	public void move()
	{
		System.out.println("Car is moving...");
	}
}

public class InterfaceDemo3 {

	public static void main(String[] args) {
		Car4 c=new Car4();
		c.move();

	}

}
