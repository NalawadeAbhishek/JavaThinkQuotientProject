package com.StringDemo;

import java.util.Scanner;

public class StringReduce {
	
	public static String reduce(String a)
	{
		String str="";
		String s[]=a.split("\\s");
		for(int i=0;i<s.length-1;i++)
		{
			String word=s[i];
			//char ch[]=word.toCharArray();
			str=str+word.charAt(0)+".";
		}
		str=str+s[s.length-1];
		return str;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s1=sc.nextLine();

		System.out.println(StringReduce.reduce(s1));

	}

}
