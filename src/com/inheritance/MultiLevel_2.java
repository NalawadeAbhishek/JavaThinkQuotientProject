package com.inheritance;

class Employee1
{
	int eid;
}
class Manager1 extends Employee1
{
	String mname;
}
class SalesManager extends Manager1
{
	
	String sdept;
	void show()
	{
		eid=464;
		mname="Amit";
		sdept="Marketing";
		System.out.println(eid+" "+mname+" "+sdept);
	}
}

public class MultiLevel_2 {

	public static void main(String[] args) {
		SalesManager s=new SalesManager();
		s.show();

	}

}
