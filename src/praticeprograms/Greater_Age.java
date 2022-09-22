package praticeprograms;

import java.util.Scanner;

public class Greater_Age {

	public static void main(String[] args) {
	
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter my age");
		int age1=sobj.nextInt();
		
		System.out.println("enter friend age");
		int age2=sobj.nextInt();
		
		if(age1>age2)
		{
			System.out.println("Hii");
		}
		else if(age2>age1)
		{
			System.out.println("Hello");
		}
		else if(age1==age2)
		{
			System.out.println("Hii Hello");
		}
		else
		{
			System.out.println("invaild input");
		}
		

	}

}
