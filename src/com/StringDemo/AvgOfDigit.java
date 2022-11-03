package com.StringDemo;

import java.util.Scanner;

public class AvgOfDigit {
	
	public static void average(String str)
	{
		int sum=0;
		int cnt=0;
		float average=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9')
			{
				int x=Character.getNumericValue(ch);
				cnt++;
				sum=sum+x;
				average=sum/cnt;
			}
		}
		System.out.println("sum = "+sum);
		System.out.println("count = "+cnt);
		System.out.println("average = "+average);
	}
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String st=sc.next();
		AvgOfDigit.average(st);

	}
}
