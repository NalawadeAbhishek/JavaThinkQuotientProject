package com.inheritance;

class Employee5
{
	public final void show()
	{
		System.out.println("Employee");
	}
	public final void show(int id)
	{
		System.out.println(id);
	}
	public static void display()
	{
		System.out.println("static");
	}
	public static void display(int a)
	{
		System.out.println(a);
	}
	
}


public class Overload_Static_Final {

	public static void main(String[] args) {
	Employee5 e=new Employee5();
	e.show();
	e.show(111);
	
	Employee5.display();
	Employee5.display(22);
	

	}

}
