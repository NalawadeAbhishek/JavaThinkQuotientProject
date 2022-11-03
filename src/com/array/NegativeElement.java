package com.array;

public class NegativeElement {

	public static void negative(int a[])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				count++;
				System.out.println(a[i]);
			}
		}
		System.out.println("negative element are ="+count);
	}
	
	public static void main(String[] args) {
		int a[]= {2,-5,-3,8,-15,-3,6};
		NegativeElement.negative(a);
	}

}
