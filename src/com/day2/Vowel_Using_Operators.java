package com.day2;

import java.util.Scanner;

public class Vowel_Using_Operators {

	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter the char ");
		char ch=sobj.next().charAt(0);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonent");
		}
		
	}

}
