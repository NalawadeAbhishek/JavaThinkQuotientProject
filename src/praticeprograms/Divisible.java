package praticeprograms;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		
		//number is divisible by 5
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number ");
		int num=sobj.nextInt();
		
		if(num%5==0 && num%11==0)
		{
			System.out.println(num+" number is divisible by 5&11");
		}
		else
		{
			System.out.println(num+" number is not divisible by 5&11");
		}
	}

}
