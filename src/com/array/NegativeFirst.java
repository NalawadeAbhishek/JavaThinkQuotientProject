package com.array;

import java.util.Arrays;

public class NegativeFirst {

	public static void negativefirst(int a[])
	{
		int j=-1;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				j++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.println(Arrays.toString(a));
	}
	
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,-4,-1,4};
		NegativeFirst.negativefirst(a);

	}

}
