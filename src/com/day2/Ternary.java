package com.day2;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number");
		int num=sobj.nextInt();
		
		//		result=condition?true:false;
		
			/*String ans=num%2==0?"even":"odd";
			System.out.println(ans);*/
			
			String res=num>0?"Positive":num<0?"Negative":"Zero";
			System.out.println(res);
			
	}

}
