package com.day3;

public class Break_Continue_Demo {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)//output=1	2
		{
			if(i==3)
			{
				break;
			}
			System.out.println(i);
		}
		
		/*for(int i=1;i<=5;i++)//1245
		{
			if(i==3)
			{
				continue;
			}
			System.out.println(i);
		}*/
		
	}

}
