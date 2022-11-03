package com.StringDemo;

import java.util.Scanner;

public class SumFirstAndLastThree {
	
	public static void checkValid(String str)
	{
		boolean ans=false;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				ans=true;
			}
			else
			{
				System.out.println("Error");
				ans=false;
				break;
			}
		}
		if(ans==true)
		{
			int sum1=0,sum2=0,x=str.length()-1;
			for(int i=0;i<3;i++)
			{
				sum1=sum1+str.charAt(i);
				sum2=sum2+str.charAt(x);
				x--;
			}
			if(sum1==sum2)
			{
				System.out.println("valid string");
			}
			else
			{
				System.out.println("invaild string");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String st=sc.next();

		SumFirstAndLastThree.checkValid(st);
	}

}
