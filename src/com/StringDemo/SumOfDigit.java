package com.StringDemo;

import java.util.Scanner;

public class SumOfDigit {

	public static void digitsum(String str)
	{
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9')
			{
				System.out.println(ch);
				int x=Character.getNumericValue(ch);
				sum=sum+x;
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		
		SumOfDigit.digitsum(s);

	}

}
