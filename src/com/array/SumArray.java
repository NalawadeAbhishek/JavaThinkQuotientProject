package com.array;

import java.util.Arrays;

public class SumArray {

	public static void sum(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int b[]=new int[2];
			int m=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==10)
				{
					b[0]=arr[i];
					b[1]=arr[j];
					m++;
				}
			}
			if(b[0]!=0 || b[1]!=0)
			{
				System.out.println(Arrays.toString(b));
			}
		}
	}
	
	public static void main(String[] args) {
		
		int a[]= {4,6,8,2,8,9,4,1,9,0};
		sum(a);

	}

}
