package com.array;

import java.util.Scanner;

public class MaxNum {

	public int maxnumber(int a[])
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		MaxNum n=new MaxNum();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		
		int Arr[]=new int[size];
		System.out.println("enter element of array");
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sc.nextInt();
		}
		
		int result=n.maxnumber(Arr);
		System.out.println("Maximum number ="+result);
		
	}

}
