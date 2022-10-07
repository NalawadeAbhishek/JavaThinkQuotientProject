package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class Sorted_Array {
	
	public static int[] sortarray(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		Sorted_Array a=new Sorted_Array();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		
		int Arr[]=new int[size];
		System.out.println("enter element of array");
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(Arr));
		System.out.println(".......................................");

		System.out.println(Arrays.toString(sortarray(Arr)));
		
	}

}
