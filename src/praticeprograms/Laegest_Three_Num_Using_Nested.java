package praticeprograms;

import java.util.Scanner;

public class Laegest_Three_Num_Using_Nested {

	public static void main(String[] args) {
		System.out.println("enter 1st number");
		Scanner sobj=new Scanner(System.in);
		int num1=sobj.nextInt();
		
		System.out.println("enter 2nd number");
		int num2=sobj.nextInt();
		
		System.out.println("enter 3rd number");
		int num3=sobj.nextInt();
		
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println("greater :"+num1);
			}
			else
			{
				System.out.println("greater :"+num3);
			}
		}
		else 
		{
			if(num2>num3)
			{
				System.out.println("greater :"+num2);
			}
			else
			{
				System.out.println("greater :"+num3);
			}
		}
	}
}
