package com.OOPs;

public class Employee {
	
	int eid;
	String name;
	double salary;

	public static void main(String[] args) {
		
		Employee nikhil=new Employee();
		nikhil.eid=23;
		nikhil.name="Nikhil";
		nikhil.salary=780000;
		System.out.println(nikhil.eid+" "+nikhil.name+" "+nikhil.salary+" ");
		
		Employee eid=new Employee();
		eid.eid=101;
		eid.name="Neha";
		eid.salary=800000;
		
		System.out.println(eid.eid+" "+eid.name+" "+eid.salary+" ");

	}

}
