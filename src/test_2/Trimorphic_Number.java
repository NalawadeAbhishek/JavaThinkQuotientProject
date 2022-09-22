package test_2;

import java.util.Scanner;

public class Trimorphic_Number {

	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number");
		int  num=sobj.nextInt();

		int temp=num;
		int ans=num*num*num;
		int digit=ans%10;
		if(digit==temp)
		{
			System.out.println("Trimorphic");
		}
		else
		{
			System.out.println("not");
		}
		
		
	}

}
