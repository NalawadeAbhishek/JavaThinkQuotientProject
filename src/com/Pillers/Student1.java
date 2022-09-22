package com.Pillers;

public class Student1 {

	int sid;
	String sname;
	
	public Student1(int id,String name)
	{
		sid=id;
		sname=name;
	}
	void display()
	{
		System.out.println(sid+" "+sname);
	}
	
	public static void main(String[] args) {
		
		Student1 s=new Student1(1,"Rajesh");
		s.display();
		

	}

}
