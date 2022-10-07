package assignment_OOPs_Test;

import java.util.Scanner;

class Automorphic {

	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number");
		int  num=sobj.nextInt();
		
		int temp1=num;
		int temp2=temp1;
		int a=0;
		int b=1;
		
		while(temp1>0)
		{
			int r=temp1%10;
			a++;
			temp1=temp1/10;
		}
		while(a>0)
		{
			b=b*10;
			a--;
		}
		int ans1=temp2*temp2;
		int ans2=ans1%b;
		if(num==ans2)
		{
			System.out.println("automorphic number");
		}
		else
		{
			System.out.println("not an automorphic number");
		}
		
	}

}
