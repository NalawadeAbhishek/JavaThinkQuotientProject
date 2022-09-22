package com.day3;

import java.util.Scanner;

public class Do_While_Demo {

	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter 1st number");
		int num1=sobj.nextInt();
		System.out.println("enter 2nd number");
		int num2=sobj.nextInt();
		
		char ch;
		do
		{
			System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
			System.out.println("enter the choice");
			int choice=sobj.nextInt();
			
		switch(choice)
		{
		case 1:
			System.out.println("Addition ="+(num1+num2));
			break;
		case 2:
			System.out.println("Substraction ="+(num1-num2));
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
			System.out.println("Do you want to continue....");
			ch=sobj.next().charAt(0);
		}while(ch=='y'||ch=='Y');

	}

}
