package com.array;

public class AvgOdd {

	public static void main(String[] args) {
		
		int arr[]={25,64,78,39,37,56,73};
		int count=0;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				count++;
				sum=sum+arr[i];
			}
		}
		double avg=sum/count;
		System.out.println("average ="+avg);
	}

}
