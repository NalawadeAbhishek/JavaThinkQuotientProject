package com.array_two_d;

public class ColmsMax {
	
	public static void colmsMax(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int max=a[0][i];
			for(int j=0;j<a[i].length;j++)
			{
				if(a[j][i]>max)
				{
					max=a[j][i];
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ="+max);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int a[][]= {{4,5,2},{7,8,6},{1,2,4}};
		
		ColmsMax.colmsMax(a);

	}

}
