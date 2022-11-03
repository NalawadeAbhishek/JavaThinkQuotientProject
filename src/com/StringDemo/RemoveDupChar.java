package com.StringDemo;

import java.util.Scanner;

public class RemoveDupChar {
	
	public static void remove(String str,String st)
	{
		char ch1[]=str.toCharArray();
		char ch2[]=st.toCharArray();
		
		int count=0;
		for(int i=0;i<ch1.length;i++)
		{
			boolean isvisited=false;
			for(int j=0;j<ch2.length;j++)
			{
				if(ch1[i]==ch2[j])
				{
					isvisited=true;
					break;
				}
			}
			if(isvisited==false)
			{
				System.out.print(ch1[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st string");
		String s1=sc.next();
		
		System.out.println("enter 2nd string");
		String s2=sc.next();
		
		RemoveDupChar.remove(s1, s2);

	}

}
