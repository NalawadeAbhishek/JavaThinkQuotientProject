package com.day3;

import java.util.Scanner;

public class Switch_Demo_String {

	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		String str=sobj.next();
		
		switch(str)
		{
		case "happy":
			System.out.println("Happy");
			break;
		case "new":
			System.out.println("New");
			break;
		case "year":
			System.out.println("Year");
			break;
		default :
			System.out.println("Welcome");
		}
	}
}
