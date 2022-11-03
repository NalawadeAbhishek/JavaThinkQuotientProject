package com.StringDemo;

import java.util.Scanner;

public class Pattern {
	
	public static void pattern(String str1,String str2)
	{
		String s1[]=str1.split(" ");
		String s2[]=str2.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(s2[j]+" ");
			}
			System.out.println();
		}
	}
	/*public static void pattern(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<=i;j++)						//a
			{											//ab
				System.out.print(str.charAt(j));		//abh
			}											//abhi
			System.out.println();
		}
	}*/
	
	/*public static void pattern(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			for(int k=str.length();k>=i;k--)				//   a
			{												//  ab
				System.out.print(" ");						// abh
			}												//abhi
			for(int j=0;j<=i;j++)
			{
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}*/
	
	/*public static void pattern(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			for(int k=str.length();k>=i;k--)				//   a
			{												//  a b
				System.out.print(" ");						// a b h
			}												//a b h i
			for(int j=0;j<=i;j++)							
			{
				System.out.print(str.charAt(j)+" ");
			}
			System.out.println();
		}
	}*/

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st string");
		String s1=sc.nextLine();
		
		System.out.println("enter 2nd string");
		String s2=sc.nextLine();

		Pattern.pattern(s1,s2);
		//Pattern.pattern(s1);
	}

}
