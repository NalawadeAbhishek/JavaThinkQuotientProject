package test_2;

import java.util.Scanner;

public class Find_Sum {

	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number");
		int  num=sobj.nextInt();
		
		int fact=1;
		int sum=0;
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
			sum=sum+fact;
		}
		System.out.println(sum);
	}

}
