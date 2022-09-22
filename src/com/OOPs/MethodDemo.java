package com.OOPs;

import java.util.Scanner;

public class MethodDemo {
	
	float price=56.24f;
	
	//1.no return type no parameter
	public void show()
	{
		System.out.println("Show Method");
	}
	
	//2.no return type with parameter
	public void addition(int a,int b)
	{
		int result=a+b;
		System.out.println(result);
		//System.out.println("result="+(a+b));
	}
	
	//3.with return type no parameter
	public float sendPrice()
	{
		return price;
	}
	
	//4.with return type with parameter
	public double area(int r,double PI)
	{
		//return (r*r*PI);
		double a=PI*r*r;
		return a;
	}
	
	public static void main(String[] args) {
		
		MethodDemo mobj=new MethodDemo();
		mobj.show();

		mobj.addition(6,8);
		float ans=mobj.sendPrice();
		System.out.println("Price="+ans);
		//System.out.println("Price="+mobj.sendPrice());
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter radius");
		int radius=sobj.nextInt();
		double PI=3.14;
		
		double circle_Area=mobj.area(radius,PI);
		System.out.println("Circle _Area="+circle_Area);
		
	}

}
