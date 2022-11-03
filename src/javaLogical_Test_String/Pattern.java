package javaLogical_Test_String;

import java.util.Scanner;

public class Pattern {
	
	public static void pattern(String str)
	{	//"India is my country"
		str=str.toLowerCase();
		str=str.replace("i","@");
		String s1[]=str.split("\\s");
		for(int i=0;i<s1.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(s1[j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st string");
		String s1=sc.nextLine();
		
		Pattern.pattern(s1);

	}

}
