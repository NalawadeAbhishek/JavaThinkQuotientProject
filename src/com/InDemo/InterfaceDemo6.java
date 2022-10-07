package com.InDemo;

interface Drinkable
{
	void tea();
}
abstract class Shop implements Drinkable
{
	
}
class TeaShop extends Shop
{
	public void tea()
	{
		System.out.println("People like tea to drink...");
	}
}

public class InterfaceDemo6 {

	public static void main(String[] args) {
		TeaShop t=new TeaShop();
		t.tea();

	}

}
