package com.day2;

import java.util.Scanner;

public class CheckChar {

	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter the char ");
		char ch=sobj.next().charAt(0);
		
		if(ch>='a' && ch<='z')
		{
			System.out.println("Alphabet");
		}
		else if(ch>='A' && ch<='Z')
		{
			System.out.println("Alphabet");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Symbol");
		}
		

	}

}
