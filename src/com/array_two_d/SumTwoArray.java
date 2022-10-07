package com.array_two_d;
import java.util.*;

public class SumTwoArray {

	public static void main(String[] args) {
		
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st array element");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("...................................");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("///////////////////////////////////////");
		System.out.println("enter 2nd array element");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("...................................");
		for(int p=0;p<b.length;p++)
		{
			for(int q=0;q<b[p].length;q++)
			{
				System.out.print(b[p][q]+" ");
			}
			System.out.println();
		}
		
		int c[][]=new int[2][2];
		for(int d=0;d<c.length;d++)
		{
			for(int e=0;e<c[d].length;e++)
			{
				c[d][e]=a[d][e]+b[d][e];
				System.out.print(c[d][e]+" ");
			}
			System.out.println();
		}
		System.out.println("///////////////////////////////");
		
		for(int x[]:c)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}		
	}

}
