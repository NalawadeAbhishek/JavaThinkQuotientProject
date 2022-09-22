package com.day2;

import java.util.Scanner;

public class ReadValue {

	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number ");
		int num=sobj.nextInt();
		System.out.println("number "+num);
		
		System.out.println("enter city name ");
		String name=sobj.next();
		System.out.println("city "+name);  //next use for only single word
		
		System.out.println("enter per ");
		float per=sobj.nextFloat();
		System.out.println("percentage "+per);
		
		/*System.out.println("enter full name ");
		String full_name=sobj.nextLine();
		System.out.println("full name ="+full_name);*/ //nexrLine use for full sentence
		
	}

}
