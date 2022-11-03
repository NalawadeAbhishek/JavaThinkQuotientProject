package com.demo;

import java.util.Scanner;

public class Demo {
	
	public static void display(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			boolean isvisited=false;
			for(int j=i-1;j>=0;j--)
			{
				if(ch[i]==ch[j])
				{
					isvisited=true;
					break;
				}
			}
			if(isvisited==false)
			{
				System.out.print(ch[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		
		Demo.display(s);
	}

}
