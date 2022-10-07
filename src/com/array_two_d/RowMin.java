package com.array_two_d;

public class RowMin {
	
	public static void rowMin(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int min=a[i][0];
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ="+min);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int a[][]= {{4,5,2},{7,8,6},{1,2,4}};
		
		RowMin.rowMin(a);

	}

}
