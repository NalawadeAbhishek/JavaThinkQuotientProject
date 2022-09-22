package com.day2;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter 1st number ");
		int num1=sobj.nextInt();
		
		System.out.println("enter 2st number ");
		int num2=sobj.nextInt();
		
		if(num1>num2)
		{
			System.out.println(num1);
		}
		else
		{
			System.out.println(num2);
		}

	}

}
