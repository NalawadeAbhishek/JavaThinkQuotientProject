package loop_and_switch_assignment;

import java.util.Scanner;

public class Sum_Even {

	public static void main(String[] args) {

		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number");
		int num=sobj.nextInt();
		
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
		
	}

}
