package com.StringDemo;

import java.util.Scanner;

public class CountWord {
	
	public static void countword(String str)
	{
		String s[]=str.split(" ");
		int count=0;
		for(int i=0;i<s.length;i++)
		{
			count++;
		}
		System.out.println("Count word in string are=" +count);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String st=sc.nextLine();
		CountWord.countword(st);

	}

}
