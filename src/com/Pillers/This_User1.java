package com.Pillers;

class Customer
{
	int id;
	String address;
	String name;
	int item_price;
	int qty;
	int total_bill;
	
	Customer(int id,String address,String name,int item_price,int qty)
	{
		this.id=id;
		this.address=address;
		this.name=name;
		this.item_price=item_price;
		this.qty=qty;
	}
	void calculate_Bill()
	{
		total_bill=qty*item_price;
	}
	void display()
	{
		if(qty>0)
		{
			this.calculate_Bill();
			System.out.println(id+" "+address+" "+name+" "+item_price+" "+qty+" "+total_bill);
		}
		else
		{
			System.out.println("Qty must be greater than zero");
		}
	}
}

public class This_User1 {

	public static void main(String[] args) {
		
		Customer cust=new Customer(1,"pune","Amit",200,2);
		//cust.calculate_Bill();
		cust.display();
		
	}

}
