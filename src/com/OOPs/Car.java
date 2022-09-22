package com.OOPs;

public class Car {

	int model;
	String name;
	int price;
	void acceptDetails(int m,String cname,int p)
	{
		model=m;
		name=cname;
		price=p;
	}
	void display()
	{
		System.out.println(model+" "+name+" "+price+" ");
	}
	
	public static void main(String[] args) {
		
		Car cobj=new Car();
		cobj.acceptDetails(5465,"Audi",8000000);
		cobj.display();
	}

}
