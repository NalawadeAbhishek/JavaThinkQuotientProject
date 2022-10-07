package com.array;

import java.util.Scanner;

public class SumOfArray {
	
	public static int sum_array(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		SumOfArray s=new SumOfArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		
		int Arr[]=new int[size];
		System.out.println("element of array ");
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sc.nextInt();
		}

		int result=SumOfArray.sum_array(Arr);
		System.out.println("sum of array ="+result);
		
	}

}
