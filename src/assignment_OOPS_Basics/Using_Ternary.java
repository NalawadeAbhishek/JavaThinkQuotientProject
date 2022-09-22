package assignment_OOPS_Basics;

import java.util.Scanner;

public class Using_Ternary {

	public static void main(String[] args) {
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number ");
		int sale=sobj.nextInt();

		float comm=sale>15000?sale*5/100:0.0f;
		System.out.println(comm);
		
	}

}
