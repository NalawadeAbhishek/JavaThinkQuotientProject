package praticeprograms;

import java.util.Scanner;

public class Check_Armstrong {

	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number");
		int num=sobj.nextInt();
		
		int multcnt=0;
		int temp=0,digit=0,sum=0;
		temp=num;
		
		while(num>0)
		{
			multcnt++;
			num=num/10;
		}
		
		num=temp;
		
		while(num>0)
		{
			int mult=1;
			digit=num%10;
			for(int i=1;i<=multcnt;i++)
			{
				mult=mult*digit;
			}
			sum=sum+mult;
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}

}
