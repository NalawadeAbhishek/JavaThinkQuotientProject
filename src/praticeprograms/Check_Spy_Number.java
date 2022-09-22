package praticeprograms;

import java.util.Scanner;

public class Check_Spy_Number {

	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number");
		int num=sobj.nextInt();
		
		int digit=0,sum=0;
		int mult=1;
		while(num>0)
		{
			digit=num%10;
			sum=sum+digit;
			mult=mult*digit;
			num=num/10;
		}
		if(sum==mult)
		{
			System.out.println("It is spy number");
		}
		else
		{
			System.out.println("It is not spy number");
		}
	}
}
