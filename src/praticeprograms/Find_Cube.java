package praticeprograms;

import java.util.Scanner;

public class Find_Cube {

	public static void main(String[] args) {
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter number");
		int num=sobj.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			int cube=i*i*i;
			System.out.println(cube+" ");
		}

	}

}
