package praticeprograms;

import java.util.Scanner;

public class Display_Single_Or_DoubleDigit {

	public static void main(String[] args) {
		//display single digit or double digit
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number");
		int num=sobj.nextInt();
		
		if(num<=9 && num>=-9)
		{
			System.out.println("Single Digit");
		}
		else if((num>9 && num<=99)||(num<=-9 && num>=-99))
		{
			System.out.println("Double Digit");
		}
		else 
		{
			System.out.println("Multi Digit");
		}
		
	}

}
