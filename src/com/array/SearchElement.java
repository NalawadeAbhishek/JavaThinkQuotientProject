package com.array;

import java.util.Scanner;

public class SearchElement {

	public boolean checkElement(int a[],int n)
	{
		boolean isPresent=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				isPresent=true;
				break;
			}
		}
		return isPresent;
	}
	
	public static void main(String[] args) {
		SearchElement s=new SearchElement();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		
		int Arr[]=new int[size];
		System.out.println("enter element of array");
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sc.nextInt();
		}
		System.out.println("Enter the search element");
		int num=sc.nextInt();
		
		boolean isPresent=s.checkElement(Arr, num);
		if(isPresent==true)
		{
			System.out.println("Element is present");
		}
		else
		{
			System.out.println("Element is not present in array");
		}
		
		
	}

}
