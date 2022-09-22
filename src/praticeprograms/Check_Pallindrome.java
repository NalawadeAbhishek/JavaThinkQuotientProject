package praticeprograms;

import java.util.Scanner;

public class Check_Pallindrome {

	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number");
		int num=sobj.nextInt();
		
		int digit=0,rev=0;
		int temp=num;
		while(num>0)
		{
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		if(rev==temp)
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not Pallindrome");
		}
	}
}
