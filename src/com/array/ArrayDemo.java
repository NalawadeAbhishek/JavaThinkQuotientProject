package com.array;
import java.util.*;

public class ArrayDemo {

	public static void main(String[] args) {
		
		char c[]= {'a','r','e','p','h'};

		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		
		char ch[]=new char[size];
		System.out.println("enter the char element");
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		System.out.println("...............................");
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		System.out.println("...............................");
		
		for(char d:ch)
		{
			System.out.println(d);
		}
		
	}

}
