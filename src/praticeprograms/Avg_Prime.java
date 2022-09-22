package praticeprograms;

import java.util.Scanner;

public class Avg_Prime {
	
	int sum=0;
	int count=0;
	double avg=0;
	public void show(int a)
	{
	for(int num=1;num<=a;num++)
	{
		boolean isPrime=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime==true)
		{
			count++;
			sum=sum+num;
			avg=sum/count;
		}
		
	}
	System.out.println(count);
	System.out.println(sum);
	System.out.println(avg);
	}
	
	public static void main(String[] args) {
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number");
		int num1=sobj.nextInt();
		Avg_Prime p=new Avg_Prime(); 
		p.show(num1);
		
	}

}
