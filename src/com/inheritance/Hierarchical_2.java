package com.inheritance;

class Employee2
{
	int esalary;
	void show()
	{
		System.out.println("Employee");
	}
	
}
class VicePresident extends Employee2
{
	void show()
	{
		esalary=50000;
		System.out.println("Employee salary ="+esalary);
	}
}
class Manager2 extends Employee2
{
	String mname="Rahul";
	void show()
	{
		System.out.println(mname);
	}
}

public class Hierarchical_2 {

	public static void main(String[] args) {
		VicePresident v=new VicePresident();
		v.show();
		
		Manager2 m=new Manager2();
		m.show();

	}

}
