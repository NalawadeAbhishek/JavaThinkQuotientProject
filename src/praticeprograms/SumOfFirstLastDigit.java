package praticeprograms;

import java.util.Scanner;

public class SumOfFirstLastDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();

		int digit;
		int first=0;
		int last=num%10;
		while(num>0)
		{
			digit=num%10;
			if((num/10)==0)
			{
				first=digit;
			}
			num=num/10;
		}
		int sum=first+last;
		System.out.println(sum);
	}

}
