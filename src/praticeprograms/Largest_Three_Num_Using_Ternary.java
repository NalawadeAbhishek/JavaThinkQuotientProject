package praticeprograms;

import java.util.Scanner;

public class Largest_Three_Num_Using_Ternary {

	public static void main(String[] args) {
		//find out greatest number betn three numbers

		Scanner sobj=new Scanner(System.in);
		System.out.println("enter 1st number");
		int a=sobj.nextInt();
		
		System.out.println("enter 2nd number");
		int b=sobj.nextInt();
		
		System.out.println("enter 3rd number");
		int c=sobj.nextInt();
		
		int d=(a>b && a>c)? a : (b>c && b>a)? b: c;//ternary operator
		System.out.println("Largest number :"+d);
		

	}

}
