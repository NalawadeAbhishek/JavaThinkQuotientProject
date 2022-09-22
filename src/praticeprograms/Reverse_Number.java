package praticeprograms;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number");
		int num=sobj.nextInt();
		
		int digit=0,rev=0;
		while(num>0)
		{
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println(rev);
	}
}
