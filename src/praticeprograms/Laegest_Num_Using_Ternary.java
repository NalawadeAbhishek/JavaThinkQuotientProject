package praticeprograms;

import java.util.Scanner;

public class Laegest_Num_Using_Ternary {

	public static void main(String[] args) {
		
		//find out largest number betn two numbers
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter 1st number");
		int a=sobj.nextInt();
		
		System.out.println("enter 2nd number");
		int b=sobj.nextInt();
		
		int c=a>b?a:b;//ternary operator
		System.out.println("Largest number :"+c);

	}

}
