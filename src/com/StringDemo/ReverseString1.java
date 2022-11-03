package com.StringDemo;

import java.util.Scanner;

public class ReverseString1 {

	public static String reverseword(String str)
	{
		String reverse=" ";
		String s[]=str.split(" ");

		for(int i=0;i<s.length;i++)
		{
			if(i==0||(i==s.length-1))
			{
				reverse=reverse+s[i];
			}
			else
			{
			String word=s[i];
			String rev=" ";
			for(int j=word.length()-1;j>=0;j--)
			{
				rev=rev+word.charAt(j);
			}
			reverse=reverse+rev+" ";
			}
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String st=sc.nextLine();
		System.out.println(ReverseString1.reverseword(st));
		
	}

}
