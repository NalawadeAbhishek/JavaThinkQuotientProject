package com.StringDemo;

import java.util.Scanner;

public class StringPallindrome {
	
	public static void pallindrome(String str)
	{
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		String st=sb.toString();
		if(str.equals(st))
		{
			System.out.println("pallindrome");
		}
		else
		{
			System.out.println(" not pallindrome");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		StringPallindrome.pallindrome(s);
	}

}
