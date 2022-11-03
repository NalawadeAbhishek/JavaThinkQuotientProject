package com.StringDemo;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayLargeWord {
	
	public static void display_large(String str)
	{
		//Largest word:i love my country     -->country
		String s[]=str.split("\\s");
		
		String max=s[0];
		for(int i=1;i<s.length;i++)
		{
			if(s[i].length()>max.length())
			{
				max=s[i];
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String st=sc.nextLine();
		DisplayLargeWord.display_large(st);
	}

}
