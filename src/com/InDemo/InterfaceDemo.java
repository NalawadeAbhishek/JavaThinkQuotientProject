package com.InDemo;

interface Printable
{
	void print();
}
class Document implements Printable
{
	public void print()
	{
		System.out.println("Document is printed...");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Document d=new Document();
		d.print();

	}

}
