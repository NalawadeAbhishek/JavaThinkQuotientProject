package praticeprograms;

import java.util.Scanner;

public class Demo {
	
	public static boolean findThree(int num)
	{
		boolean isPresent=false;
		return isPresent;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean isPresent=false;
		
		if(num>0)
		{
			while(num>0)
			{
				int r=num%10;
				if(r==3)
				{
					isPresent=true;
				}
				num=num/10;
			}
		}
		else
		{
			isPresent=false;
		}
		System.out.println(isPresent);
	}
	
}
