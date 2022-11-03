package com.StringDemo;

import java.util.Scanner;

public class WordFrequency {

	public static void frequency(String str,String st)
	{
		String s[]=str.split(" ");
		int count=0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i].equals(st))
			{
				count++;
			}
		}
		System.out.println("count word "+st+" is "+count+" times");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s1=sc.nextLine();
		
		System.out.println("enter word");
		String s2=sc.next();
		
		WordFrequency.frequency(s1,s2);
	}

}
