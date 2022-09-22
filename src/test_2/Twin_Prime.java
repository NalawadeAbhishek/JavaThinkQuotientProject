package test_2;

import java.util.Scanner;

public class Twin_Prime {

	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter 1st number");
		int num1=sobj.nextInt();

		System.out.println("enter 2nd number");
		int num2=sobj.nextInt();
		
		boolean isPrime1=true;
		boolean isPrime2=true;
		for(int i=2;i<num1;i++)
		{
			if(num1%i==0)
			{
				isPrime1=false;
				break;
			}
		}
		for(int i=2;i<num2;i++)
		{
			if(num2%i==0)
			{
				isPrime2=false;
				break;
			}
		}
		if(isPrime1==true && isPrime2==true)
		{
			if(num1-num2==2 || num1-num2==-2)
			{
				System.out.println("Both are twin prime");
			}
			else
			{
				System.out.println("Both are not twin prime");
			}
		}
		else
		{
			System.out.println("One of the prime");
		}

	}

}
