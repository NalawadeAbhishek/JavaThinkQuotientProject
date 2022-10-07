package assignment_OOPs_Test;

import java.util.Scanner;

public class Country {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1.India\n2.China\n3.Bangladesh\n4.Italy\n5.United State");
		System.out.println("enter choice from above");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("National game of India is Hockey");
			break;
		case 2:
			System.out.println("National game of China is Table Tennis");
			break;
		case 3:
			System.out.println("National game of Bangladesh is Kabaddi");
			break;
		case 4:
			System.out.println("National game of Italy is Football");
			break;
		case 5:
			System.out.println("National game of United State is Baseball");
			break;
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("India\nChina\nBangladesh\nItaly\nUnited State");
		System.out.println("enter choice from above");
		String str =sc.nextLine();
		
		switch(str)
		{
		case "India":
			System.out.println("National game of India is Hockey");
			break;
		case "india":
			System.out.println("National game of India is Hockey");
			break;
		case "China":
			System.out.println("National game of China is Table Tennis");
			break;
		case "china":
			System.out.println("National game of China is Table Tennis");
			break;
		case "Bangladesh":
			System.out.println("National game of Bangladesh is Kabaddi");
			break;
		case "bangladesh":
			System.out.println("National game of Bangladesh is Kabaddi");
			break;
		case "Italy":
			System.out.println("National game of Italy is Football");
			break;
		case "italy":
			System.out.println("National game of Italy is Football");
			break;
		case "United State":
			System.out.println("National game of United State is Baseball");
			break;
		case "united state":
			System.out.println("National game of United State is Baseball");
			break;*/
		}
		
	}

}
