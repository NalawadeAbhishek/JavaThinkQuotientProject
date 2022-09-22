package praticeprograms;

import java.util.Scanner;

public class Prime_Number1 {

	public static void main(String[] args) {
		
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
				System.out.println(num);
			}
		}
		
		/*int num=2;
		while(num<=20)
		{
			//int i=2;
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
				System.out.println(num);
			}
			num++;
		}*/
	}

}
