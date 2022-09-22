package loop_and_switch_assignment;

import java.util.Scanner;

public class Display_Table {

	public static void main(String[] args) {

		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number ");
		int num=sobj.nextInt();

		int mult=1;
		for(int i=1;i<=10;i++)
		{
			 mult=num*i;
			 System.out.println(mult);
		}
		
		
		
	}

}
