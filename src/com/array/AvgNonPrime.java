package com.array;

import java.util.Scanner;

public class AvgNonPrime {
	
	public double average(int a[])
	{
		double ans=0;
		int count=0;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			int num=a[i];
			boolean isPrime=true;
			for(int j=2;j<num;j++)
			{
				if(num%j==0)
				{
					isPrime=false;
					count++;
					break;
				}
			}
			if(isPrime==false)
			{
				sum=sum+a[i];
				ans=sum/count;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		AvgNonPrime a=new AvgNonPrime();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		
		int Arr[]=new int[size];
		System.out.println("enter element of array");
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sc.nextInt();
		}
		
		double result=a.average(Arr);
		System.out.println(result);

	}

}
