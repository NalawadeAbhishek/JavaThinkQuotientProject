package com.StringDemo;

import java.util.Scanner;

public class Lower_Case {
	
	public static void lower(String str)
	{
		String s1=" ";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A' || str.charAt(i)<='Z')
			{
				s1=s1+((char)(str.charAt(i)+32));
			}
		}
		System.out.println(s1);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		
		Lower_Case.lower(s);

	}

}
