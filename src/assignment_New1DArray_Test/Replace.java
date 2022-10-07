package assignment_New1DArray_Test;

import java.util.Arrays;

public class Replace {
	
	public static void replace(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				System.out.print("1"+" ");
			}
			else
			{
				System.out.print(a[i]+" ");
			}
		}
	}
	public static void main(String[]args)
	{
		int arr[]= {26,0,67,45,0,78,54,34,10,0,34};
		Replace.replace(arr);
		
	}
	
}
