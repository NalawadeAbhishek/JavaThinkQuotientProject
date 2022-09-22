package com.Pillers;

class Order
{
	int oid;
	String city;
	int cust_id;
	int status;
	
	Order(int oid,String city,int cust_id,int status)
	{
		this.oid=oid;
		this.city=city;
		this.cust_id=cust_id;
		this.status=status;
	}
	Order()
	{
		this(1,"pune",8454,1);
		if(status==0)
		{
			System.out.println("your order is out for deliver");
		}
		else
		{
			System.out.println("Order is delivered");
			show_OrderDetails();
		}
	}
	void show_OrderDetails()
	{
		System.out.println(oid+" "+city+" "+cust_id+" "+status);
	}
	
}

public class ThisUser2 {

	public static void main(String[] args) {
		
		Order o=new Order();
		

	}

}
