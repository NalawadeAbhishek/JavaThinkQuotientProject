package com.StringDemo;

import java.util.*;

class CharacterFrequency
{
	public static void frequency(String s)
	{
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			boolean isvisited=false;
			for(int k=i-1;k>=0;k--)
			{
				if(ch[i]==ch[k])
				{
					isvisited=true;
					break;
				}
			}	
			if(isvisited==false)
			{
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						count++;
					}
				}
			}
			if(isvisited==false)
			{
				System.out.println(ch[i]+" "+count);
			}
		}	
	}

	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();

		CharacterFrequency.frequency(s);
	}
}