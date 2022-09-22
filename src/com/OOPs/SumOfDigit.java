package com.OOPs;

import java.util.Scanner;

public class SumOfDigit {
	
	int digit=0;
	int sum=0;
	public int digit_sum(int n)
	{
		while(n>0)
		{
			digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		SumOfDigit s=new SumOfDigit();
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number");
		int num=sobj.nextInt();
		
		int result=s.digit_sum(num);
		System.out.println(result);
		
		
	}

}
