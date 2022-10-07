package com.array;

import java.util.Scanner;

public class MinNum {

	public int minnumber(int a[])
	{
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		MinNum n=new MinNum();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		
		int Arr[]=new int[size];
		System.out.println("enter element of array");
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sc.nextInt();
		}
		
		int result=n.minnumber(Arr);
		System.out.println("Maximum number ="+result);

	}

}
