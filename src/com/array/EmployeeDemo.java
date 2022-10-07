package com.array;

import java.util.Arrays;

class Employee
{
	int id;
	String name;
	int salary;
	
	Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return id+" "+name+" "+salary;
	}
}

public class EmployeeDemo {

	public static void main(String[]args)
	{
		Employee e[]=new Employee[3];
		e[0]=new Employee(1,"Amit",50000);
		e[1]=new Employee(2,"Sachin",70000);
		e[2]=new Employee(3,"Rahul",8000);
		
		for(Employee a:e)
		{
			System.out.println(a);
		}
		System.out.println(".................................");
		
		//System.out.println(Arrays.toString(e));
		
		for(int i=0;i<e.length;i++)
		{
			if(e[i].salary>20000)
			{
				System.out.println(e[i]);
			}
		}
		
	}	
}		