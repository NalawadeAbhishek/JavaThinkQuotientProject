package praticeprograms;

import java.util.Scanner;

public class Find_Power {

	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter base");
		int base=sobj.nextInt();
		
		System.out.println("enter exponent");
		int exp=sobj.nextInt();
		
		int power=1;
		for(int i=1;i<=exp;i++)
		{
			power=power*base;
		}
		System.out.println(power);
	}

}
