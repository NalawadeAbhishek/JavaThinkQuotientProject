package com.pack;

class Address1
{
	private int pincode;
	private String city;
	
	public void setPincode(int pincode)
	{
		this.pincode=pincode;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public int getPincode()
	{
		return pincode;
	}
	public String getCity()
	{
		return city;
	}
}

public class Person1 {

	private int id;
	private String name;
	private Address1 adr;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAdd(Address1 adr)
	{
		this.adr=adr;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public Address1 getAdd() 
	{
		return adr;
	}
	
	public static void main(String[] args) {
	
		Person1 p=new Person1();
		p.setId(1);
		p.setName("Neha");
		p.setAdd(new Address1());
		
		p.getAdd().setPincode(454613);
		p.getAdd().setCity("Mumbai");
		
		System.out.println(p.getId()+" "+p.getName()+" "+p.getAdd().getPincode()+" "+p.getAdd().getCity());
	}
}
