package com.Pillers;

public class Student {

	public Student()
	{
		System.out.println("Default");
	}
	
	public Student(String name)
	{
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		Student s=new Student();
		
		Student s1=new Student("Neha");
		
	}

}
