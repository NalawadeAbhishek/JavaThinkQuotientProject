package praticeprograms;

import java.util.Scanner;

public class Display_Table_5 {

	public static void main(String[] args) {
	
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number");
		int num=sobj.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" * "+i+"="+num*i);
		}
		
		//display table 1 to 5
				/*for(int j=1;j<=5;j++)
				{
				int mult=1;
				for(int i=1;i<=10;i++)
				{
					 mult=j*i;
					 System.out.println(mult);
				}
				System.out.println("/////////////////////////");
				}*/
	}
}
