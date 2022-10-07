package assignment_OOPs_Test;

class Employee
{
	int eid;
	String ename;
	int esalary;
	
	Employee(int eid,String ename,int esalary)
	{
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
	}
//	public void display()
//	{
//		System.out.println("eid="+eid+" ename="+ename+" esalary="+ename);
//	}
	
	public String toString()
	{
		return ("eid="+eid+" ename="+ename+" esalary="+ename);
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		Employee e=new Employee(54545,"Sachin",50000);
		//e.display();
		System.out.println(e);
	}

}
