package praticeprograms;

import java.util.Scanner;

public class Convert_Binary_To_Decimal {

	public static void main(String[] args) {

		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number");
		int num=sobj.nextInt();
		
		int temp=num;
		int digit=0;
		boolean isBinary=true;
		while(num>0)
		{
			digit=num%10;
			if(digit>1||digit<0)
			{
				isBinary=false;
				break;
			}
			num=num/10;
		}
		if(isBinary==true)
		{
			System.out.println("Binary");
			num=temp;
			int sum=0;
			int p=0;
			while(num>0)
			{
				digit=num%10;
				int power=(int)(Math.pow(2, p));
				int mult=power*digit;
				sum=sum+mult;
				p++;
				num=num/10;
			}
			System.out.println(sum);
		}
		else
		{
			System.out.println("Not Binary");
		}
	}

}
