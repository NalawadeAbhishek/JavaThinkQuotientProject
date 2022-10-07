package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
	
	public static int[] merge(int a[],int b[])
	{
		int c[]=new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			c[k]=a[i];
			k++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[k]=b[i];
			k++;
		}
		return c;
	}

	public static void main(String[] args) {
		MergeArray m=new MergeArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size1=sc.nextInt();
		
		int Arr[]=new int[size1];
		System.out.println("enter element of first array");
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sc.nextInt();
		}
		
		System.out.println("enter size of array");
		int size2=sc.nextInt();
		int Brr[]=new int[size2];
		System.out.println("enter element of second array");
		for(int i=0;i<Brr.length;i++)
		{
			Brr[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(MergeArray.merge(Arr,Brr)));

	}

}
