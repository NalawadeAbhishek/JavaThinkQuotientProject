package com.inheritance;

class Mobile
{
	String brandName;
}
class Apple extends Mobile
{
	String RAM;
}
class IPhonePro extends Apple
{
	String Camera="32px";
	void show()
	{
		brandName="x";
		RAM="128GB";
		System.out.println(brandName+" "+RAM+" "+Camera);
	}
}

public class MultiLevel {

	public static void main(String[] args) {
		IPhonePro p=new IPhonePro();
		p.show();

	}

}
