package assignment_OOPS_Basics;

import java.util.Scanner;

public class Commision {

	public static void main(String[] args) {
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number ");
		int sale=sobj.nextInt();
		
		if(sale>2000)
		{
			int comm=sale*5/100;
			System.out.println("Commision ="+comm);
		}
		else
		{
			System.out.println("Target not acheived");
		}

	}

}
