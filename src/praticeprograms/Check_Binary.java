package praticeprograms;

import java.util.Scanner;

public class Check_Binary {

	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number");
		int num=sobj.nextInt();
		
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
		}
		else
		{
			System.out.println("Not Binary");
		}
	}

}
