package praticeprograms;

import java.util.Scanner;

public class Find_Avg_Of_Digit_Of_Num {

	public static void main(String[] args) {
		//find out the average of digit from number
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number");
		int num=sobj.nextInt();
		
		int sum=0;
		int digit=0;
		int cnt=0;
		while(num>0)
		{
			digit=num%10;
			cnt++;
			sum=sum+digit;
			num=num/10;	
		}
		System.out.println("sum ="+sum);
		System.out.println("count ="+cnt);
		
		int average=sum/cnt;
		System.out.print("average ="+average);
	}

}
