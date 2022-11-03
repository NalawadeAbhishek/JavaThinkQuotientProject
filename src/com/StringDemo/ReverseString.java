package com.StringDemo;

import java.util.Scanner;

public class ReverseString {
	
	public static String reverse(String str)
	{
		String s1=" ";
		/*for(int i=0;i<str.length();i++)
		{
			s1=str.charAt(i)+s1;
		}
		return s1;*/
		
		/*for(int i=str.length()-1;i>=0;i--)
		{
			s1=s1+str.charAt(i);
		}
		return s1;*/
		
		/*char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			s1=s1+ch[i];
		}
		return s1;*/
		
		char ch[]=str.toCharArray();
		
		int j=ch.length-1;
		for(int i=0;i<ch.length/2;i++)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			j--;
		}
		String s2=new String(ch);
		return s2;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String st=sc.next();
		System.out.println(ReverseString.reverse(st));
	
	}

}
