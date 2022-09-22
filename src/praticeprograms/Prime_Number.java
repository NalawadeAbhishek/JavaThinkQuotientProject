package praticeprograms;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number");
		int num=sobj.nextInt();

		int i=2;
		boolean isPrime=true;
		while(i<num)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
			i++;
		}
		if(isPrime==true)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
		
		/*boolean isPrime=true;
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
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}*/
	}

}
