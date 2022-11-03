package com.demo;

import java.util.Arrays;
import java.util.Scanner;

class Course
{
	int cid;
	String cname;
	
	Course(int cid,String cname)
	{
		this.cid=cid;
		this.cname=cname;
	}
	public String toString()
	{
		return cid+" "+cname;
	}
}

public class Student {
	
	int id;
	String name;
	Course c[];
	
	Student(int id,String name,Course c[])
	{
		this.id=id;
		this.name=name;
		this.c=c;		
	}
	public String toString()
	{
		return id+" "+name+" "+Arrays.toString(c);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s[]=new Student[3];
		for(int i=0;i<s.length;i++)
		{
			System.out.println("enter student id");
			int sid=sc.nextInt();
			System.out.println("enter student name");
			String sname=sc.next();
			System.out.println("enter number of course for this student");
			int courseCnt=sc.nextInt();
			Course cArr[]=new Course[courseCnt];
			
			for(int j=0;j<cArr.length;j++)
			{
				System.out.println("enter course id");
				int cid=sc.nextInt();
				System.out.println("enter course name");
				String cname=sc.next();
				cArr[j]=new Course(cid,cname);
			}
			
			s[i]=new Student(sid,sname,cArr);
		}
		System.out.println("/////////////////////////////////");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}

}
