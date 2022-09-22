package praticeprograms;

import java.util.*;

public class Check_Even_Using_Switch {

	public static void main(String[] args) {
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter value");
		int num=sobj.nextInt();

		int ans=(num%2);
		
		switch(ans)
		{
		case 0:
			System.out.println("even number");
			break;
		case 1:
			System.out.println("odd number");
			break;
		}

	}

}
