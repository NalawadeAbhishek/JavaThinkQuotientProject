package array_Test2;

import java.util.Arrays;

public class MergeAlternate {
	
	public static void merge(int a[],int b[])
	{
		int c[]=new int[a.length+b.length];
		int m=0;
		int n=1;
		for(int i=0;i<c.length;)
		{
			c[i]=a[m];
			if(m<b.length)
			{
				c[n]=b[m];
				m++;
				i=i+2;
				n=n+2;
			}
			else
			{
				m++;
				i++;
			}
		}
		for(int x:c)
		{
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		int b[]= {11,22,33,44};
		
		MergeAlternate.merge(a,b);
	}

}
