package com.array_two_d;

public class ColmsSum {

	public static void colmsSum(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[j][i];
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ="+sum);
			System.out.println();
		}
	}
	
	public static void main(String []args)
	{
		int a[][]= {{4,5,2},{7,8,6},{1,2,4}};
		
		ColmsSum.colmsSum(a);
	}
}
