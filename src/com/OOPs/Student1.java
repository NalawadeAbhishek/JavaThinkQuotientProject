package com.OOPs;

public class Student1 {

	int id;
	String name;
	
	void acceptDetails(int roll,String sname)
	{
		id=roll;
		name=sname;
		//display();
		System.out.println("hiii");
	}
	void display()
	{
		acceptDetails(45,"Nikhil");
		System.out.println("id ="+id+" "+"name ="+name);
	}
	
	public static void main(String[] args) {
		
		Student1 s=new Student1();
		//s.acceptDetails(1,"Amit");
		s.display();

	}

}
