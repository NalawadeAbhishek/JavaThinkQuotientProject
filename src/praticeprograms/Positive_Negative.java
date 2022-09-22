package praticeprograms;

import java.util.Scanner;

public class Positive_Negative {

	public static void main(String[] args) {
		//check number is +ve,-ve or zero
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number ");
		int num=sobj.nextInt();
		
		if(num>0)
		{
			System.out.println("number is positive");
		}
		else if(num<0)
		{
			System.out.println("number is negative");
		}
		else
		{
			System.out.println("number is zero");
		}

	}

}
