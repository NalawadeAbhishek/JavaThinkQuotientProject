package assignment_OOPS_Basics;

import java.util.Scanner;

public class Print_Work_Place {

	public static void main(String[] args) {
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter age ");
		int a=sobj.nextInt();
		
		System.out.println("enter sex (M or F) ");
		char b=sobj.next().charAt(0);
		
		System.out.println("enter marital status (Y or N) ");
		char c=sobj.next().charAt(0);
		
		if(a>=20 && a<=60)
		{
			if(b=='f'||b=='F')
			{
				System.out.println("Place of service = Urban area only");
			}
			else if((b=='m'||b=='M') && (a>=20 && a<=40))
			{
				System.out.println("Place of service = Can work anywhere");
			}
			else if((b=='m'||b=='M') && (a>40 && a<=60))
			{
				System.out.println("Place of service = Urban area only");
			}
		}
		else
		{
			System.out.println("Error");
		}
	}

}
