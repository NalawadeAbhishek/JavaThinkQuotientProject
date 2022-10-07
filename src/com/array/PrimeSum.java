package com.array;

import java.util.Scanner;

public class PrimeSum {

	public int primesum(int a[])
	{
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
					break;
				}
			}
			if(isPrime==true)
			{
				sum=sum+a[i];
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		PrimeSum s=new PrimeSum();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		
		int Arr[]=new int[size];
		System.out.println("enter element of array");
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sc.nextInt();
		}
		
		int result=s.primesum(Arr);
		System.out.println("Sum of prime number ="+result);

	}

}
