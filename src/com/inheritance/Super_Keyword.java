package com.inheritance;

class Flower
{
	String color="Red";
}
class Rose extends Flower
{
	String color="Black";
	void show()
	{
	System.out.println("Rose color="+super.color+" "+color);
	}
}

public class Super_Keyword {

	public static void main(String[] args) {
		Rose r=new Rose();
		r.show();

	}

}
