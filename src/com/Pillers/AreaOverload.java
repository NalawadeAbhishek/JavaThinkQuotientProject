package com.Pillers;

public class AreaOverload {

	public double area(double PI,int r)
	{
		return (PI*r*r);
	}
	public double area(int l,int w)
	{
		return (l*w);
	}
	public double area(int s)
	{
		return (s*s);
	}
	public static void main(String[] args) {
		AreaOverload a=new AreaOverload();
		System.out.println("Area of circle ="+a.area(3.14f,4));
		System.out.println("Area of reactangle ="+a.area(2,8));
		System.out.println("Area of square ="+a.area(5));
		
	}

}
