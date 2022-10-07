package com.array_two_d;

public class ColmsMin {
	
	public static void colmsMin(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int min=a[0][i];
			for(int j=0;j<a[i].length;j++)
			{
				if(a[j][i]<min)
				{
					min=a[j][i];
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ="+min);
			System.out.println();
		}
	}

	public static void main(String[] args) {
int a[][]= {{4,5,2},{7,8,6},{1,2,4}};
		
		ColmsMin.colmsMin(a);

	}

}
