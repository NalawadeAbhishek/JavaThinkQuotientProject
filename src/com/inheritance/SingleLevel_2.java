package com.inheritance;

class Employee
{
	int id=1111;
}
class Manager extends Employee
{
	String mname="Amit";
	void show()
	{
		System.out.println("Employee id ="+id+" Manager name="+mname);
	}
}

public class SingleLevel_2 {

	public static void main(String[] args) {
		Manager m=new Manager();
		m.show();
		
	}

}
