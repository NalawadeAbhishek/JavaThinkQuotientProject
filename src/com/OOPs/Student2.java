package com.OOPs;

public class Student2 {

	private int a=12;
	
	int b=65;
	
	protected int c=58;
	
	public int d=412;
	
	public static void main(String[] args) {
	
		Student2 stu=new Student2();
		System.out.println(stu.a);//private
		System.out.println(stu.b);//default
		System.out.println(stu.c);//protected
		System.out.println(stu.d);//public
	}

}
