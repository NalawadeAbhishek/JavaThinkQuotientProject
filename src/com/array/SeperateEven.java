package com.array;

import java.util.Scanner;

public class SeperateEven {
	
	public void evenodd(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
			else
			{
				System.out.println(a[i]);
			}
		}
	}

	public static void main(String[] args) {
		SeperateEven s=new SeperateEven();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		
		int Arr[]=new int[size];
		System.out.println("enter element of array");
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sc.nextInt();
		}
		
		s.evenodd(Arr);

	}

}
