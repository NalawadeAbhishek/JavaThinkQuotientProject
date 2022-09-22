package praticeprograms;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		//check number is even or odd
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number ");
		int num=sobj.nextInt();
		
		if(num%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		
	}

}
