package praticeprograms;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter year");
		int yr=sobj.nextInt();
		
		if(yr%4==0)
		{
			System.out.println(yr+" is a leap year");
		}
		else
		{
			System.out.println(yr+" is not leap year");
		}
		
		
		/*String leap=(yr%4==0)?"leap year":" not leap year"; 
		System.out.println(leap);*/
		
	}

}
