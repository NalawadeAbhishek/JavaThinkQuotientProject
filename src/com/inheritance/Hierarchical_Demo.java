package com.inheritance;

class Vehical1
{
	int Wheels;
	void show()
	{
		System.out.println("Vertical");
	}
}
class Car1 extends Vehical1
{
	void show()
	{
		Wheels=4;
		System.out.println("Car="+Wheels);
	}
}
class Truck1 extends Vehical1
{
	void show()
	{
		Wheels=12;
		System.out.println("Truck="+Wheels);
	}
}

public class Hierarchical_Demo {

	public static void main(String[] args) {
		Vehical1 v=new Vehical1();
		v.show();
		

	}

}
