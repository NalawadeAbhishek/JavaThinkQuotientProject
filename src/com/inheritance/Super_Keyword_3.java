package com.inheritance;

class Car_1
{
	String color="White";
	Car_1(int price)
	{
		System.out.println("Car Price ="+price);
	}
	void show()
	{
		System.out.println("Car XUV700");
	}
	
}
class XUV700 extends Car_1
{
	String color="Black";
	XUV700()
	{
		super(2000000);
		System.out.println("Good Features");
	}
	void show()
	{
		super.show();
		System.out.println("XUV700 color="+super.color+" "+color);
	}
	
}


public class Super_Keyword_3 {

	public static void main(String[] args) {
		XUV700 x=new XUV700();
		x.show();

	}

}
