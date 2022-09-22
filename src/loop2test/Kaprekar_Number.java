package loop2test;

import java.util.Scanner;

public class Kaprekar_Number {

	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number");
		int num=sobj.nextInt();
		
		int count=0;
		int sqr=num*num;
		int temp=sqr;
		int sum=0;
		
		while(sqr>0)
		{
			count++;
			sqr=sqr/10;
		}
		int r=(int)(Math.pow(10,count/2));
		while(temp>0)
		{
			sum=sum+temp%r;
			temp=temp/r;
		}
		if(num==sum)
		{
			System.out.println("Kaprekar Number");
		}
		else
		{
			System.out.println("Not");
		}
	}

}
