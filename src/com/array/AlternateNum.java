package com.array;

import java.util.Scanner;

public class AlternateNum {

	public void display(int a[])
	{
		for(int i=0;i<a.length;i=i+2)
		{
				System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		AlternateNum a=new AlternateNum();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		
		int Arr[]=new int[size];
		System.out.println("element of array ");
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sc.nextInt();
		}
		
		System.out.println("....display alternate number..........");
		a.display(Arr);
		

	}

}
