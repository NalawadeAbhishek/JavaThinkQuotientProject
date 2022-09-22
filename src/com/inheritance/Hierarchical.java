package com.inheritance;

class Vehical
{
	int Wheels;
}
class Car extends Vehical
{
	void showCar()
	{
		Wheels=4;
		System.out.println(Wheels);
	}
}
class Truck extends Vehical
{
	void showTruck()
	{
		Wheels=12;
		System.out.println(Wheels);
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		Car c=new Car();
		c.showCar();//4
		
		Truck t=new Truck();
		t.showTruck();//12

	}

}
