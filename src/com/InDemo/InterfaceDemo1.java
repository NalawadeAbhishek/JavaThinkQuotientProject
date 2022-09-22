package com.InDemo;

interface Printable1
{
	int x=12;
	void print();
}
class Document1 implements Printable1
{
	public void print()
	{
		System.out.println("Document is printed...");
	}
}

public class InterfaceDemo1 {

	public static void main(String[] args) {
		Document1 d=new Document1();
		d.print();
		System.out.println(d.x);
	}

}
