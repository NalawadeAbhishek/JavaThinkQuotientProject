package com.array;
import java.util.*;

class Student
{
	int id;
	String name;
	int marks;
	
	Student(int id,String name,int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public String toString()
	{
		return id+" "+name+" "+marks;
	}
}

public class StudentDemo {

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		Student st[]=new Student[3];
		
		for(int i=0;i<st.length;i++)
		{
			System.out.println("enter id");
			int sid=sc.nextInt();
			System.out.println("enter name");
			String sname=sc.next();
			System.out.println("enter marks");
			int marks=sc.nextInt();
			
			st[i]=new Student(sid,sname,marks);
		}
		for(int i=0;i<st.length;i++)
		{
			System.out.println(st[i]);
		}
		System.out.println(".................................");
		for(Student s:st)
		{
			System.out.println(s);
		}
		System.out.println(".................................");
		
		System.out.println(Arrays.toString(st));
	}
	
}
