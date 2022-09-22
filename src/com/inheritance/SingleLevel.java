package com.inheritance;

class Animal
{
	int legs=4;
}

class Dog extends Animal
{
	void show()
	{
		System.out.println("Dog has "+legs+" Legs");
	}
}

public class SingleLevel {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.show();

	}

}
