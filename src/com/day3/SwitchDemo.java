package com.day3;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {

		Scanner sobj=new Scanner(System.in);
		System.out.println("enter the 1st number");
		int num1=sobj.nextInt();
		
		System.out.println("enter the 2nd number");
		int num2=sobj.nextInt();
		
		System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
		System.out.println("enter the choice from above menu");
		int choice=sobj.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Addition ="+(num1+num2));
			break;
		case 2:
			System.out.println("Substration ="+(num1-num2));
			break;
		case 3:
			System.out.println("Multiplication ="+(num1*num2));
			break;
		case 4:	
			System.out.println("Division ="+(num1/num2));
			break;
		default :
			System.out.println("invaild choice");
		}
	}
}
