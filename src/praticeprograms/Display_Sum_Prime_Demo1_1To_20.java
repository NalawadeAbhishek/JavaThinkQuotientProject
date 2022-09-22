package praticeprograms;

import java.util.Scanner;

public class Display_Sum_Prime_Demo1_1To_20 {

	public static void main(String[] args) {

		int sum=0;
		for(int num=1;num<=20;num++)
		{
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
				sum=sum+num;
			}
		}
		System.out.println("sum ="+sum);
	}
}
