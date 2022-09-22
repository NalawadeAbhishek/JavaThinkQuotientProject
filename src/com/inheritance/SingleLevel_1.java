package com.inheritance;

class Animal_1
{
	int legs;
	public void read(int legs)
	{
		this.legs=legs;
	}
}
class Cat extends Animal_1
{
	//override
	public void read(int s)
	{
		System.out.println("Cats=");
	}
	void show()
	{
		System.out.println("Cat has "+legs+" legs");
	}
}

public class SingleLevel_1 {

	public static void main(String[] args) {
		Cat c=new Cat();
		c.read(4);
		c.show();

	}

}
