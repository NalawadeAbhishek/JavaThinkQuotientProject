package com.pack;

class Department1
{
	int did;
	String dname;
	
	Department1(int did,String dname)
	{
		this.did=did;
		this.dname=dname;
	}
	public String toString()
	{
		return did+" "+dname;
	}
	
}

public class Employee1 {

	int id;
	String ename;
	int salary;
	Department1 dept;
	
	Employee1(int id,String ename,int salary,Department1 dept)
	{
		this.id=id;
		this.ename=ename;
		this.salary=salary;
		this.dept=dept;
	}
	
	public String toString()
	{
		return id+" "+ename+" "+salary+" "+dept;
	}
	
	public static void main(String[] args) {
		Employee1 e=new Employee1(1,"Neha",80000,new Department1(5,"sales"));
		
		System.out.println(e);
		
	}

}
