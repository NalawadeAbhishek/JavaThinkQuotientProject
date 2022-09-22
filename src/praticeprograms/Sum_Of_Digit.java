package praticeprograms;

import java.util.Scanner;

public class Sum_Of_Digit {

	public static void main(String[] args) {

		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number");
		int num=sobj.nextInt();
		
		int digit=0;
		int sum=0;
		while(num!=0)
		{
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println("summation ="+sum);
	}

}
