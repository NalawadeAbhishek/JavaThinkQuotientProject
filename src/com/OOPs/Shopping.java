package com.OOPs;

public class Shopping {

	String atom_name;
	int quantity;
	int pricePerAtom;
	int total;
	
	void acceptdetails(String aname,int qua,int price)
	{
		atom_name=aname;
		quantity=qua;
		pricePerAtom=price;
	}
	void calculateBill()
	{
		if(quantity>0)
		{
			total=pricePerAtom*quantity;
		}
		
	}
	void displayShoppingDetails()
	{
		if(quantity>0)
		{
			System.out.println("Atom name ="+atom_name+"\n"+ "Quantity of atom ="+quantity+"\n"+"Price per atom ="+pricePerAtom+"\n"+" Total bill ="+total);
		}
		else
		{
			System.out.println("Error");
		}
	}
	
	
	public static void main(String[] args) {
		Shopping sp=new Shopping();
		sp.acceptdetails("t-shirt",2,250);
		sp.calculateBill();
		sp.displayShoppingDetails();

	}

}
