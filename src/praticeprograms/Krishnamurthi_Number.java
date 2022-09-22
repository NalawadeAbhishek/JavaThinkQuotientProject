package praticeprograms;

import java.util.Scanner;

public class Krishnamurthi_Number {

	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number");
		int num=sobj.nextInt();
		
		int sum=0;
		int temp=num;
		while(num>0)
		{
			int fact=1;
			int digit=num%10;
			for(int i=1;i<=digit;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		System.out.println(sum);
		//num=temp;
		if(sum==temp)
		{
			System.out.println("Krishnamurthi");
		}
		else
		{
			System.out.println("Not");
		}
	}

}
