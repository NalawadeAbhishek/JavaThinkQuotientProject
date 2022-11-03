package com.demo;

import java.util.Arrays;
import java.util.Scanner;

class Course1 {

	int cid;
	String cname;
	String duration;
	
	Course1(int cid,String cname,String duration)
	{
		this.cid=cid;
		this.cname=cname;
		this.duration=duration;
	}
	
	public String toString()
	{
		return "Course id "+cid+" Course name "+cname+" Duration "+duration+"\n";
	}
}

class Student1
{
	int sid;
	String sname;
	Course1 c[];
	
	Student1(int sid,String sname,Course1 c[])
	{
		this.sid=sid;
		this.sname=sname;
		this.c=c;
	}
	public String toString()
	{
		return "Student id " +sid+ " Student name " +sname+ "\n"+Arrays.toString(c);
	}
	
	public static void getArray(Student1 s[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id for details");
		int id=sc.nextInt();
		for(int i=0;i<s.length;i++)
		{
			if(s[i].sid==id)
			{
				System.out.println(s[i]);
			}
		}
	}
	public static void getUpdate(Student1 s[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id for update :");
		int id=sc.nextInt();
		for(int i=0;i<s.length;i++)
		{
			Course1 a[]=s[i].c;
			if(s[i].sid==id)
			{
				for(int j=0;j<a.length;j++)
				{
					System.out.println("enter new name");
					String newname=sc.next();
					s[i].sname=newname;
				}
			}
		}
	}
	public static void getDelete(Student1 s[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id for delete :");
		int id=sc.nextInt();
		for(int i=0;i<s.length;i++)
		{
			if(s[i].sid==id)
			{
				s[i]=null;
			}
		}
	}
}

public class Crud_Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student1 s[]=new Student1[2];
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println("enter student id");
			int sid=sc.nextInt();
			System.out.println("enter student name");
			String sname=sc.next();
			System.out.println("enter number of course");
			int cnt=sc.nextInt();
			Course1 crr[]=new Course1[cnt];
			for(int j=0;j<crr.length;j++)
			{
				System.out.println("enter course id");
				int cid=sc.nextInt();
				System.out.println("enter course name");
				String cname=sc.next();
				System.out.println("enter course duration");
				String duration=sc.next();
				crr[j]=new Course1(cid,cname,duration);
			}
			s[i]=new Student1(sid,sname,crr);
		}
		for(Student1 stu:s)
		{
			System.out.println(stu);
		}
		Student1.getArray(s);
		Student1.getUpdate(s);
		
		System.out.println("/////////////////////////////");
		for(Student1 stu:s)
		{
			System.out.println(stu);
		}
		
		Student1.getDelete(s);
		System.out.println("/////////////////////////////");
		for(Student1 stu:s)
		{
			System.out.println(stu);
		}
	}

}
