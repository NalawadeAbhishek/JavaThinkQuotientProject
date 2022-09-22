package com.Pillers;

public class CarGetterSetterInfo {

	public static void main(String[] args) {
		
		CarGetterSetter c=new CarGetterSetter();
		c.setModel(542314);
		c.setPrice(2000000);
		c.setName("XUV700");
		c.setSpeed(90);
		
		System.out.println(c.getModel());
		System.out.println(c.getPrice());
		System.out.println(c.getName());
		System.out.println(c.getSpeed());
		
		
	}

}
