package com.demo;

import java.util.Scanner;

public class LagestWord {
	
	public static void largeword(String str)
	{
		String s[]=str.split("\\s");
		String max=s[0];
	
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()>max.length())
			{
				max=s[i];
			}
		}
		System.out.println("maximum word ="+max);
		for(int j=0;j<s.length;j++)
		{
			if(s[j].equals(max))
			{
				continue;
			}
			else
			{
				if(s[j].length()==max.length())
				{
					System.out.println("maximum word="+s[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string ");
		String s=sc.nextLine();
		
		LagestWord.largeword(s);
	}

}
