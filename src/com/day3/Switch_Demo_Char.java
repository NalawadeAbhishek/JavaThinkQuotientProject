package com.day3;

import java.util.Scanner;

public class Switch_Demo_Char {

	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter input");
		char ch=sobj.next().charAt(0);
		
		switch(ch)
		{
		case 'a':
			System.out.println("Vowel");
			break;
		case 'e':
			System.out.println("Vowel");
			break;
		case 'i':
			System.out.println("Vowel");
			break;
		case 'o':
			System.out.println("Vowel");
			break;
		case 'u':
			System.out.println("Vowel");
			break;
		default :
			System.out.println("Consonent");
		
		}
	}

}
