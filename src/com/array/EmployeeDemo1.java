package com.array;
import java.util.*;

class Employee1
{
	int id;
	String name;
	int salary;
	
	Employee1(int id,String name,int salary)
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

public class EmployeeDemo1 {

	public static void main(String[] args) {
		Employee1 e[]=new Employee1[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<e.length;i++)
		{
			System.out.println("enter id");
			int eid=sc.nextInt();
			System.out.println("enter name");
			String ename=sc.next();
			System.out.println("enter salary");
			int esalary=sc.nextInt();
			
			e[i]=new Employee1(eid,ename,esalary);
		}
		System.out.println(".......................................");
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i]);
		}
		System.out.println(".......................................");
		for(int i=0;i<e.length;i++)
		{
			if(e[i].salary<=15000)
			{
				e[i].salary=e[i].salary+(e[i].salary*10/100);
				
			}
			System.out.println(e[i]);
		}
		
	}

}
