package com.array;

import java.util.*;

public class ArrayCreation {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("...........................");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("...........................");

		for(int x:a)
		{
			System.out.println(x);
		}
		
	}

}
