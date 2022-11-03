package com.array;

public class SecondMax {

	public static int secondmax(int a[])
	{
		int max1=a[0];
		int max2=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max1)
			{
				max1=a[i];
				max1=max2;
			}
			else if(a[i]>max2 && a[i]!=max1)
			{
				max2=a[i];
			}
		}
		//System.out.println(max1+" "+max2);
		return max2;
	}
	
	public static void main(String[] args) {
		int a[]= {2,5,3,8,25,12,36,72,69,6};
		int ans=SecondMax.secondmax(a);
		System.out.println("max2="+ans);
		//SecondMax.secondmax(a);
	}

}
