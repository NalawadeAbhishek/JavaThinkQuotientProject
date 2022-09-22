package loop2test;

import java.util.Scanner;

public class Count_Frequency {

	public static void main(String[] args) {

		Scanner sobj=new Scanner(System.in);
		System.out.println("enter mob. number");
		long num=sobj.nextLong();
	
		long temp=num;
		
		int c=0;
		
		while(num>0)
		{
			c++;
			num=num/10;
		}
		num=temp;
		long digit=0;
		
		for(int i=0;i<=9;i++)
		{
			int count=0;
			num=temp;
			while(num>0)
			{
				digit=num%10;
				if(digit==i)
				{
					count++;
				}
				num=num/10;
			}
			if(count>0)
			{
				System.out.println(i+" "+count);
			}
		}
			
	}
}
