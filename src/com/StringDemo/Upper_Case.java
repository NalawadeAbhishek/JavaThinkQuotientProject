package com.StringDemo;

import java.util.Scanner;

public class Upper_Case {
	
	public static void upper(String str)
	{
		String s1=" ";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a' || str.charAt(i)<='z')
			{
				s1=s1+((char)(str.charAt(i)-32));
			}
		}
		System.out.println(s1);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		
		Upper_Case.upper(s);

	}

}
