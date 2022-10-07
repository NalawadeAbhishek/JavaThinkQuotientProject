package com.array;
import java.util.*;
import java.util.Arrays;

public class FindFrequency {

	public static void frequency(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			boolean isvisited=false;
			for(int k=i-1;k>=0;k--)
			{
				if(a[i]==a[k])
				{
					isvisited=true;
					break;
				}
			}
			if(isvisited==false)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
					}
				}
				/*if(count==1)//unique element count sati hi condition
				{
					System.out.println(a[i]+" "+count);
				}*/      //output=3  1
				if(count>1)
				{
					System.out.println(a[i]+" "+count);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		FindFrequency f=new FindFrequency();
		int a[]= {6,5,6,6,8};
		
		//f.frequency(a);
		FindFrequency.frequency(a);
		
	}

}
