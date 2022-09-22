package com.inheritance;

class Laptop
{
	Laptop(String RAM)
	{
		System.out.println("Laptop"+" "+RAM);
	}
}
class Dell extends Laptop
{
	Dell()
	{
		super("128 GB");
		System.out.println("Good Laptop");
	}
}

public class Super_Keyword_2 {

	public static void main(String[] args) {
		Dell d=new Dell();

	}

}
