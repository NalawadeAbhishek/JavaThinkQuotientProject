package com.Pillers;

public class EmpInfo {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.setId(101);
		emp.setName("Neha");
		emp.setSalary(670000);
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());

	}

}
