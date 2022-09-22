package com.OOPs;

public class Vehicle {
	
	int model;
	String name;
	int price;
	
	void acceptDetails(int m,String vname,int p)
	{
		model=m;
		name=vname;
		price=p;
	}
	void display()
	{
		System.out.println(model+" "+name+" "+price+" ");
	}

	public static void main(String[] args) {
		
		Vehicle vobj=new Vehicle();
		vobj.acceptDetails(8784,"Shine",98000);
		vobj.display();

	}

}
