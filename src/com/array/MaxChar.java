package com.array;

import java.util.Scanner;

public class MaxChar {

	public char maxChar(char ch[])
	{
		char max=ch[0];
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>max)
			{
				max=ch[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		MaxChar m=new MaxChar();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		
		char ch1[]=new char[size];
		System.out.println("enter element of array");
		for(int i=0;i<ch1.length;i++)
		{
			ch1[i]=sc.next().charAt(0);
		}
		
		char result=m.maxChar(ch1);
		System.out.println("maximum character ="+result);
	}

}
