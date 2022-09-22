package com.day3;

import com.OOPs.Student2;

public class StudentOutPackage2 extends Student2 {

	public static void main(String[] args) {
		
		Student2 g=new Student2();
		//System.out.println(g.a);//error private is access with in same class
		//System.out.println(g.b);//default
		//System.out.println(g.c);//protected
		System.out.println(g.d);//
		
		StudentOutPackage2 p=new StudentOutPackage2();
		System.out.println(p.c);//protected(it is accessible bcoz by using extends keyword)
		System.out.println(p.d);//public
	}

}
