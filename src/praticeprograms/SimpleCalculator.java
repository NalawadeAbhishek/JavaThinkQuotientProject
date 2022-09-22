package praticeprograms;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter 1st number");
		int num1=sobj.nextInt();
		
		System.out.println("enter 2nd number");
		int num2=sobj.nextInt();

		System.out.println("1.'+'\n2.'-'\n3.'*'\n4.'/'");
		System.out.println("enter the choice from above menu");
		char choice=sobj.next().charAt(0);
		
		switch(choice)
		{
		case '+':
			System.out.println("Addition ="+(num1+num2));
			break;
		case '-':
			System.out.println("Substraction="+(num1-num2));
			break;
		case '*':
			System.out.println("Multiplication ="+(num1*num2));
			break;
		case '/':
			System.out.println("Division ="+(num1/num2));
			break;
		default :
			System.out.println("invaild choice");
		
		}
		
		
		
	}

}
