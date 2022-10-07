package com.array;
import java.util.*;

public class EvenSum {
	
	public int evensum(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				sum=sum+a[i];
			}
		}
		return sum;
	}
	
	public void even_position(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(a[i]);
			}
		}
	}
	

	public static void main(String[] args) {
		EvenSum e=new EvenSum();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("enter element of array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int result=e.evensum(arr);
		System.out.println("sum of even element ="+result);
		
		System.out.println("....even position element..........");
		
		e.even_position(arr);
		
	}

}
