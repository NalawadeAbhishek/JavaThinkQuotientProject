package com.array_two_d;

public class Pattern2 {

	public static void pattern(int a[][])
	{
		/*for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)				//* * * *
			{											//* * * *
				System.out.print("*"+" ");				//* * * *
			}											//* * * *
			System.out.println();
		}*/
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i>=j)									//*
				{											//* *
					System.out.print("*"+" ");				//* * *
				}											//* * * *
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int a[][]=new int[4][4];
		
		Pattern2.pattern(a);

	}

}
