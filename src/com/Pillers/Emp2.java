package com.Pillers;

public class Emp2 {

	int salary=20000;
	
	public void getEmp2(Emp2 e1)
	{
		System.out.println(e1.salary);
	}
	public void input()
	{
		/*Emp2 e=new Emp2();
		this.getEmp2(e);*/
		
		//this.getEmp2(e1);
		
		//this.getEmp2(new Emp2());
		
		this.getEmp2(this);
	}
	
	public static void main(String[] args) {
		Emp2 emp=new Emp2();
		emp.input();

	}

}
