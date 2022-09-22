package com.InDemo;

interface Printable2
{
	int x=12;
	void print();
	
	default void show()
	{
		System.out.println("show method");
	}
	static void edit()
	{
		System.out.println("edit before print");
	}
}
class Document2 implements Printable2
{
	public void print()
	{
		System.out.println("Document is printed...");
	}
}

public class InterfaceDemo2 {

	public static void main(String[] args) {
		Document2 d=new Document2();
		d.print();
		d.show();
		Printable2.edit();
		System.out.println(d.x);
	}

}
