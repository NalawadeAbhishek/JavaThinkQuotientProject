package praticeprograms;

import java.util.Scanner;

public class Duck_Number {

	public static void main(String[] args) {
		
		System.out.println("enter the number");
		Scanner sobj=new Scanner(System.in);
		int num=sobj.nextInt();
		
		int temp=num;
		int digit=0;
		while(temp>0)
		{
			digit=temp%10;
			temp=temp/10;
		}
		int ans=0;
		System.out.println(digit);
		
		if(digit!=0)
		{
			for(int i=num;i>0;i=i/10)
			{
				int p=i%10;
				if(p==0)
				{
					ans++;
				}
			}
			System.out.println(ans);
			if(ans>0)
			{
				System.out.println("duck number");
			}
			else
			{
				System.out.println("not duck number");
			}
		}
		else
		{
			System.out.println("not duck number");
		}
		
	}

}
