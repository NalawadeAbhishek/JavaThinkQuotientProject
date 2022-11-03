package com.array;
import java.util.*;

public class IndexDisplay {

	public static void index(int a[],int b)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b)
			{
				System.out.println(a[i]+"  "+i);
			}
		}
		
	}
	
	public static void main(String[] args) {
		IndexDisplay d=new IndexDisplay();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("enter element ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter search element ");
		int b=sc.nextInt();
		
		IndexDisplay.index(a, b);
		
	}

}
