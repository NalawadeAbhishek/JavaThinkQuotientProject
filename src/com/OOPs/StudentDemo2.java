package com.OOPs;

public class StudentDemo2 {
	
	public static void main(String[] args) {
		Student2 s=new Student2();
		//System.out.println(s.a);//error private access only same class
		System.out.println(s.b);//default
		System.out.println(s.c);//protected
		System.out.println(s.d);//public
		
	}

}
