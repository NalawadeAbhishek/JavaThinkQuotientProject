package com.array;
import java.util.*;

public class StudInfo {

	int id;
	String name;
	int marks[];
	StudInfo(int id,String name,int marks[])
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public String toString()
	{
		return id+" "+name+" "+Arrays.toString(marks);
	}
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		StudInfo st[]=new StudInfo[3];
		for(int i=0;i<st.length;i++)
		{
			System.out.println("enter id");
			int sid=sc.nextInt();
			System.out.println("enter name");
			String sname=sc.next();
			int mk[]=new int[3];
			for(int j=0;j<mk.length;j++)
			{
				System.out.println("enter marks");
				mk[j]=sc.nextInt();
			}
			
			st[i]=new StudInfo(sid,sname,mk);
		}
		System.out.println(".......................................");
		
		for(int i=0;i<st.length;i++)
		{
			System.out.println(st[i]);
		}
		System.out.println("...........................................");
		
		for(int i=0;i<st.length;i++)
		{
			int m[]=st[i].marks;
			
			int sum=0;
			for(int j=0;j<m.length;j++)
			{
				sum=sum+m[j];
			}
			int per=sum/m.length;
			if(per>60)
			{
				System.out.println(st[i]+"   per ="+per);
			}
		}
		
	}
	
}
