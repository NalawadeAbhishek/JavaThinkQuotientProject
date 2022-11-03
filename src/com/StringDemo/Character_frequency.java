package com.StringDemo;

import java.util.Scanner;

public class Character_frequency {

	public static void count(String str,char ch)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println("character "+ch+" is "+count+" times");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s1=sc.nextLine();
		
		System.out.println("enter character");
		char ch1=sc.next().charAt(0);
		
		Character_frequency.count(s1,ch1);
	}

}
