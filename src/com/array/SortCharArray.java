package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class SortCharArray {
	
	public static char[] sortarray(char ch[])
	{
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;i<ch.length;j++)
			{
				if(ch[i]<ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		return ch;
	}

	public static void main(String[] args) {
		SortCharArray a=new SortCharArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		
		char ch1[]=new char[size];
		System.out.println("enter element of array");
		for(int i=0;i<ch1.length;i++)
		{
			ch1[i]=sc.next().charAt(0);
		}
		System.out.println(Arrays.toString(ch1));
		System.out.println("..................................");
		System.out.println(Arrays.toString(sortarray(ch1)));

	}

}
