package com.StringDemo;

import java.util.Scanner;

public class WordFrequency1 {
	
	public static void word(String str)
	{
		String s[]=str.split("\\s");
		
		for(int i=0;i<s.length;i++)
		{
			int count=1;
			boolean isvisited=false;
			for(int k=i-1;k>=0;k--)
			{
				if(s[i].equals(s[k]))
				{
					isvisited=true;
					break;
				}
			}	
			if(isvisited==false)
			{
				for(int j=i+1;j<s.length;j++)
				{
					if(s[i].equals(s[j]))
					{
						count++;
					}
				}
			}
			if(isvisited==false)
			{
				System.out.println(s[i]+" "+count);
			}
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s1=sc.nextLine();
		
		WordFrequency1.word(s1);
	}

}
