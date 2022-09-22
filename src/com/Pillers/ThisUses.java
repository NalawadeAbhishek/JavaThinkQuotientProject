package com.Pillers;

class Car_1
{
	int model;
	String name;
	int price;
	
	public Car_1(int model,String name,int price)
	{
		this.model=model;
		this.name=name;
		this.price=price;
	}
	void display()
	{
		System.out.println(model+" "+name+" "+price);
	}
	
}
public class ThisUses {

	public static void main(String[] args) {
		
		Car_1 c=new Car_1(4654,"Audi",560000);
		c.display();
		

	}

}
