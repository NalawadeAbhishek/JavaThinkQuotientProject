package com.inheritance;

class Flower1
{
	String color="Red";
	void show()
	{
		System.out.println("Flower");
	}
}
class Rose1 extends Flower1
{
	String color="Black";
	void show()
	{
		super.show();
		System.out.println("Rose");
	}
}

public class Super_Keyword_1 {

	public static void main(String[] args) {
		Rose1 r=new Rose1();
		r.show();
	
	}

}
