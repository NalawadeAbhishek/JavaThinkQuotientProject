package com.array_two_d;

public class Pattern {

	public static void pattern(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==0 ||j==0 ||i==a.length-1 ||j==a.length-1)
				{
					System.out.print(a[i][j]+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	/*public static void pattern(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)							//* * * * *
			{														//*       *
				if(i==0||j==0||i==a.length-1||j==a.length-1)		//*       *
				{													//*       *
					System.out.print("*"+" ");						//* * * * *
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}*/
	
	public static void main(String[] args) {
		int a[][]= {{1,2,3,4,5},{4,5,6,7,8},{6,8,7,9,3},{9,5,7,2,8},{2,5,6,3,7}};

		Pattern.pattern(a);
		
		//int a[][]=new int[4][4];
		//Pattern.pattern(a);
	}

}
