package praticeprograms;

import java.util.Scanner;

public class DisplayEven_1To20_Using_Break {

	public static void main(String[] args) {
		//display even no. betn 1 to 20 if any no. is divisible by 3 then break
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number");
		int num=sobj.nextInt();
		
		int i=0;
		/*for( i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				if(i%3==0)
				{
					continue;
				}
				else
				{
					System.out.print(i+" ");
				}
			}
		}*/
		
		for(i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				if(i%3==0)
				{
					break;
				}
				System.out.print(i+" ");
			}	
		}
	}
}
