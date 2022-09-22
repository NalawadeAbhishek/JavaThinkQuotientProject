package loop_and_switch_assignment;

import java.util.Scanner;

public class Use_Break {

	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number");
		int num=sobj.nextInt();
		boolean isPrime=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime==true)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not");
		}
	}

}
