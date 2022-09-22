package praticeprograms;

import java.util.Scanner;

public class Display_Sum_Prime_Demo2_1To_20 {

	public static void main(String[] args) {
		
		int sum=0;
		for(int num=1;num<=20;num++)
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
				sum=sum+num;
			}
		}
		System.out.println("sum ="+sum);
	}

}
