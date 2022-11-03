package array_Test2;

import java.util.Arrays;

public class Swapping {

	public static void swapping(int a[])
	{
		int j=a.length-1;
		for(int i=0;i<a.length;i++)
		{
			if(i<2)
			{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			j--;
			}
		}
		System.out.println(Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		Swapping.swapping(a);
	}

}
