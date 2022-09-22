package praticeprograms;

import java.util.Scanner;

public class Average_Of_Digit {

	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		
		int cnt=0;
		int sum=0;
		double average=0;
		for(int i=1;i<=20;i++)
		{
			if(i%2!=0)
			{
				cnt++;
				sum=sum+i;
				average=sum/cnt;
			}
		}
		//System.out.println(cnt);
		System.out.println(average);
	}

}
