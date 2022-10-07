package com.array;

import java.util.Scanner;

public class MinChar {

	public static char minchar(char ch[])
	{
		char min=ch[0];
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]<min)
			{
				min=ch[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		MinChar m=new MinChar();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		
		char ch1[]=new char[size];
		System.out.println("enter element of array");
		for(int i=0;i<ch1.length;i++)
		{
			ch1[i]=sc.next().charAt(0);
		}
		
		MinChar.minchar(ch1);
		System.out.println("minimun character ="+MinChar.minchar(ch1));
		
	}

}
