package com.StringDemo;

import java.util.Scanner;

public class CountCharacter {

	public static void countcharacter(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("count ="+count);
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		CountCharacter.countcharacter(s);
		
	}

}
