package com.day3;

import java.util.Scanner;

public class Magical_Number {

	public static void main(String[] args) {
	
		int magic=67;
		Scanner sobj=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("enter the number for gussing");
			int num=sobj.nextInt();
			if(num<magic)
			{
				System.out.println("Number is less try again...");
				continue;
			}
			else if(num>magic)
			{
				System.out.println("Number is greater pls try again...");
				continue;
			}
			else
			{
				System.out.println("Number is correct...");
				break;
			}
		}
	}
}
