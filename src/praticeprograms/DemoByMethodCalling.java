package praticeprograms;

import java.util.Scanner;

class DemoByMethodCalling {
	
	public int sumprime(int a)
	{
		int sum=0;
	for(int num=1;num<=a;num++)
	{
	boolean isprime=true;
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			isprime=false;
			break;
		}
	}
	if(isprime==true)
	{
		sum=sum+num;
	}
	}
	return sum;
	}
	
	public static void main(String[] args) {
		DemoByMethodCalling d=new DemoByMethodCalling();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number ");
		int num1=sc.nextInt();
		
		int sum=d.sumprime(num1);
		System.out.println(sum);
	}

}
