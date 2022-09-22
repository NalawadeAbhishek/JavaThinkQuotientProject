package praticeprograms;

import java.util.Scanner;

public class Total_Num_Of_Day {

	public static void main(String[] args) {
		//total number of days in a month
		Scanner sobj=new Scanner(System.in);
		System.out.println("1.january\n2.february\n3.march\n4.april\n5.may\n6.june\n"
				+ "7.july\n8.august\n9.september\n10.october\n11.november\n12.december");
		System.out.println("enter month");
		int month=sobj.nextInt();
		
		switch(month)
		{
		case 1:
			System.out.println("31 days in january ");
			break;
		case 2:
			System.out.println("28 days in february ");
			break;
		case 3:
			System.out.println("31 days in march ");
			break;
		case 4:
			System.out.println("30 days in april ");
			break;	
		case 5:
			System.out.println("31 days in may");
			break;	
		case 6:
			System.out.println("30 days in june");
			break;	
		case 7:
			System.out.println("31 days in july");
			break;	
		case 8:
			System.out.println("31 days in august");
			break;	
		case 9:
			System.out.println("30 days in september");
			break;	
		case 10:
			System.out.println("31 days in october");
			break;	
		case 11:
			System.out.println("30 days in november");
			break;	
		case 12:
			System.out.println("31 days in december");
			break;	
	
		}
	}
}
