package com.DemoProject;

import java.util.Scanner;

class Order
{
	Scanner sc=new Scanner(System.in);
	int quantity=sc.nextInt();
	char ch=sc.next().charAt(0);
	Order()
	{
		/*do 
		{
			System.out.println("select from following");
			int a=sc.nextInt();
			switch(a)
			{
			case 1:
				System.out.println("NormalColdCoffee");
				System.out.println("enter quantity");
				quantity=sc.nextInt();
			break;
			case 2:
				System.out.println("ThickColdCoffee");
				System.out.println("enter quantity");
				quantity=sc.nextInt();
			break;
			case 3:
				System.out.println("HotCoffee");
				System.out.println("enter quantity");
				quantity=sc.nextInt();
			break;	
			default :System.out.println("Do you want to add order");
			}
		}while(ch=='Y'||'y');*/
	}
}

class Menu
{
	int normalColdCoffee=30;
	int ThickColdCoffee=50;
	int hotCoffee=40;
	Order o;
	
	public void display()
	{
		System.out.println("NormalColdCoffee="+normalColdCoffee);
		System.out.println("ThickColdCoffee="+ThickColdCoffee);
		System.out.println("HotCoffee="+hotCoffee);
	}
}

public class CoffeeShop {
	
	public static void main(String[] args) {
		Menu m=new Menu();
		m.display();
		
	}

}
