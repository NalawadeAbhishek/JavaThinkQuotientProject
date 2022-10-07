package com.array;

import java.util.Scanner;

public class AlternateChar {

	public static void alternate(char ch[])
	{
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='y'||ch[i]=='Y'||ch[i]=='z'||ch[i]=='Z')
			{
				ch[i]=(char)(ch[i]-24);
			}
			else
			{
				ch[i]=(char)(ch[i]+2);
			}
			System.out.println(ch[i]);
		}
		
	}
	
	public static void main(String[] args) {
		AlternateChar a=new AlternateChar();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		
		char ch1[]=new char[size];
		System.out.println("enter element of array");
		for(int i=0;i<ch1.length;i++)
		{
			ch1[i]=sc.next().charAt(0);
		}
		System.out.println("......................");
		AlternateChar.alternate(ch1);
		
	}

}
