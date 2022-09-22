package com.Pillers;

public class Car {

	String color;
	
	public void doChange(Car c)
	{
		c.color="red";
	}
	
	public static void main(String[] args) {
		
		Car BMW=new Car();
		BMW.color="Black";
		Car c1=new Car();
		c1.doChange(c1);
		//c1.color="red";
		
		System.out.println(BMW.color);//Black
		System.out.println(c1.color);//red 
		
		/*Car BMW=new Car();
		BMW.color="Black";
		Car c1=BMW;
		BMW.doChange(c1);
		//c1.color="red";
		
		System.out.println(BMW.color);//red
		System.out.println(c1.color);//red*/

	}

}
