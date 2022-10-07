package assignment_OOPs_Test;

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

public class Employee2 {

	private int id;
	private String name="HI";
	private boolean ismanager;
	private float salary;
	private Department dept;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setManager(boolean ismanager)
	{
		this.ismanager=ismanager;
	}
	public void setSalary(float salary)
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
		return name;
	}
	public boolean getManager()
	{
		return ismanager;
	}
	public float getSalary()
	{
		return salary;
	}
	public Department getDept()
	{
		return dept;
	}

}
