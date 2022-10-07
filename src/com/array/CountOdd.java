package com.array;

import java.util.Scanner;

public class CountOdd {
	
	public void count_odd(int a[])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				count++;
			}
		}
		System.out.println("count odd element ="+count);
	}

	public static void main(String[] args) {
		CountOdd c=new CountOdd();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		
		int Arr[]=new int[size];
		System.out.println("element of array ");
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sc.nextInt();
		}
		
		c.count_odd(Arr);
		

	}

}
