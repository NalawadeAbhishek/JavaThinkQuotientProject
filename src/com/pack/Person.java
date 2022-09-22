package com.pack;

class Address
{
	int pincode;
	String city;
	
	Address(int pincode,String city)
	{
		this.pincode=pincode;
		this.city=city;
	}
	/*void show_Address()
	{
		System.out.println(pincode+" "+city);
	}*/
	
	public String toString()
	{
		return pincode+" "+city;
	}
	
}

public class Person {

	int id;
	String name;
	Address adr;
	
	Person(int id,String name,Address adr)
	{
		this.id=id;
		this.name=name;
		this.adr=adr;
	}
	
	/*void display_Person()
	{
		System.out.println(id+" "+name+" ");
		adr.show_Address();
	}*/
	
	public String toString()
	{
		return id+" "+name+" "+adr;
	}
	
	public static void main(String[] args) {
	
		Person p=new Person(111,"Neha",new Address(425351,"Mumbai"));
		
		System.out.println(p);
		
		//		OR
		
		/*Address a=new Address(412411,"Pune");
		
		Person p=new Person(566,"Amit",a);
		p.display_Person();
		//a.show_Address();//it is also allow*/
		
	}

}
