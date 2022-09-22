package com.pack;

class Department
{
	private int did;
	private String dname;
	
	public void setId(int did)
	{
		this.did=did;
	}
	public void setDeptName(String dname)
	{
		this.dname=dname;
	}
	public int getId()
	{
		return did;
	}
	public String getDeptName()
	{
		return dname;
	}
}

public class Employee {

	private int id;
	private String ename;
	private int salary;
	private Department dept;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String ename)
	{
		this.ename=ename;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public void setDept(Department dept)
	{
		this.dept=dept;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return ename;
	}
	public int getSalary()
	{
		return salary;
	}
	public Department getDept()
	{
		return dept;
	}
	
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(2);
		e.setName("Amit");
		e.setSalary(50000);
		e.setDept(new Department());
		
		e.getDept().setId(10);
		e.getDept().setDeptName("Marketing");
		
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.getDept().getId()+" "+e.getDept().getDeptName());
		
	}

}
