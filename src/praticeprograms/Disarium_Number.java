package praticeprograms;

import java.util.Scanner;

public class Disarium_Number {

	public static void main(String[] args) {
	
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number");
		int num=sobj.nextInt();
		
		int temp=num;
		int ans=temp;
		int digit=0,cnt=0,sum=0;
		while(num>0)
		{
			digit=num%10;		//57496
			cnt++;				//543 2 1
			num=num/10;	
		}
		while(temp>0)
		{
			int a=temp%10;
			int c=(int)(Math.pow(a,cnt--));
			sum=sum+c;
			temp=temp/10;
		}
		if(sum==ans)
		{
			System.out.println("Disarium");
		}	
		else
		{
			System.out.println("Not");
		}
	}

}
