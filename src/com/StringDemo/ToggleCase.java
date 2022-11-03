package com.StringDemo;

import java.util.Scanner;

public class ToggleCase {

	public static void toggle(String str)
	{
		String s1=" ";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				s1=s1+((char)(str.charAt(i)+32));
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				s1=s1+((char)(str.charAt(i)-32));
			}
			else
			{
				s1=s1+str.charAt(i);
			}
		}
		System.out.println(s1);
		
		/*for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				s1=s1+Character.toLowerCase(str.charAt(i));
			}
			else if(Character.isLowerCase(str.charAt(i)))
			{
				s1=s1+Character.toUpperCase(str.charAt(i));
			}
			else
			{
				s1=s1+str.charAt(i);
			}
		}
		System.out.println(s1);*/
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();

		ToggleCase.toggle(s);
	}

}
