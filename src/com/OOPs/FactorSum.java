package com.OOPs;

import java.util.Scanner;

public class FactorSum {

	public int sum_fact(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		FactorSum s=new FactorSum();
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number");
		int num=sobj.nextInt();
		
		int result=s.sum_fact(num);
		System.out.println(result);

	}

}
