package com.day2;

import java.util.Scanner;

public class NestedDemo {

	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter the year");
		int yr=sobj.nextInt();
		System.out.println("enter the per");
		int per=sobj.nextInt();
		
		if(yr==2021 && per>60)
		{
			System.out.println("selected for interview");
		}
		else
		{
			System.out.println("not selected");
		}
		
		/*if(yr==2021)
		{
			if(per>60)
			{
				System.out.println("selected for interview");
			}
			else
			{
				System.out.println("per is less try next time...");
			}
		}
		else
		{
			System.out.println("not selected");
		}*/
		
		
	}

}
