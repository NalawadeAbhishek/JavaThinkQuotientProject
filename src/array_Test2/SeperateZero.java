package array_Test2;

import java.util.Arrays;

public class SeperateZero {
	
	public static void seperatezero(int a[])
	{
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[j]==0)
			{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
			else if(a[j]!=0)
			{
				j++;
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		int a[]= {12,0,7,0,8,0,3};
		SeperateZero.seperatezero(a);
		
	}

}
