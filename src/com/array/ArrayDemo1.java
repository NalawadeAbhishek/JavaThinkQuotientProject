package com.array;
import java.util.*;

public class ArrayDemo1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		
		float Brr[]=new float[size];
		System.out.println("enter the element of array");
		for(int i=0;i<Brr.length;i++)
		{
			Brr[i]=sc.nextFloat();
		}
		System.out.println("...............................");

		for(int i=0;i<Brr.length;i++)
		{
			System.out.println(Brr[i]);
		}
		System.out.println("...............................");
		
		for(float f:Brr)
		{
			System.out.println(f);
		}
		
	}

}
