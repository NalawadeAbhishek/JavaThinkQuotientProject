package praticeprograms;

import java.util.*;


public class Count_Frequency {

	public static void main(String[] args) {
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number");
		int  num=sobj.nextInt();
		
		System.out.println("find the fre of no.");
		int num1=sobj.nextInt();
		
		int frequency=0;
		int digit;
		while(num>0)
		{
			digit=num%10;
			if(digit==num1)
			{
				frequency++;
			}
			num=num/10;
		}
		System.out.println("frequency of number is="+frequency);

	}

}
